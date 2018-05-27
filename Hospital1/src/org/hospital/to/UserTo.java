package org.hospital.to;

import java.io.Serializable;

public class UserTo implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int uid;
private String userName;
private String userEmail;
private String userPanno;
private String userPow;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserPanno() {
	return userPanno;
}
public void setUserPanno(String userPanno) {
	this.userPanno = userPanno;
}
public String getUserPow() {
	return userPow;
}
public void setUserpow(String userPow) {
	this.userPow = userPow;
}
}
