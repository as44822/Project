package org.hospital.dao;



import org.hospital.to.UserTo;

import java.util.*;

public interface UserDao {
	public boolean addUser(UserTo usr);
	public List<UserTo> getAllUser();
}

