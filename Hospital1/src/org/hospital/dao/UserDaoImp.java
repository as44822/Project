package org.hospital.dao;

import java.util.List;

import org.hospital.hibernate.User;
import org.hospital.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImp implements UserDao {
	@Autowired
	HibernateTemplate hTemp;

	@Override
	public List<UserTo> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(UserTo usr) {
		User user=new User();
		user.setName(usr.getUserName());
		user.setEmail(usr.getUserEmail());
		user.setPanno(usr.getUserPanno());
		user.setPass(usr.getUserPow());
		hTemp.save(user);
		return true;
	}

}
