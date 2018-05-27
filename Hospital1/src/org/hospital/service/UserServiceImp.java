package org.hospital.service;

import org.hospital.dao.UserDao;
import org.hospital.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService {
	@Autowired
	UserDao userDao;
	
	@Override
	public boolean addUser(UserTo uto) {
		
		return userDao.addUser(uto);
	}

}
