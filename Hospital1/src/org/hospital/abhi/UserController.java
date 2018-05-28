package org.hospital.abhi;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.hospital.service.UserService;
import org.hospital.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@RequestMapping(value={"/showadduser.hos"})
	protected String showUserPage(Map<String,UserCommand> map) throws Exception{
		System.out.println("Show User Page");
		UserCommand u=new UserCommand();
		map.put("user", u);
		return "user";
		
	}
	@RequestMapping(value={"/adduser.hos"},method=RequestMethod.POST)
	protected String addUser(@ModelAttribute(value="user") UserCommand user,HttpServletRequest req) throws Exception{
		System.out.println("Add User");
		String name=user.getUserName();
		String email=user.getUserEmail();
		String panno=user.getUserPanno();
		String pow=user.getUserPwd();
		
		UserTo uto=new UserTo();
		uto.setUserName(name);
		uto.setUserEmail(email);
		uto.setUserPanno(panno);
		uto.setUserpow(pow);
		
		boolean added=userService.addUser(uto);
		if(added){
			req.setAttribute("MSG", "User Added Successfully");
			System.out.println("User Added Successfully");
		}else{
			req.setAttribute("MSG", "Error While Adding User");
			System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		}
		return "user";
	}
	}

