package org.hospital.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;


@Entity
@Table(name="user1")
public class User {
	@Id
	// in Oracle  CREATE SEQUENCE USER_SEQ START WITH 1 INCREMENT BY 1;
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "USER_SEQ")
	@Column(name="userid")
	int uid;
	@Column(name="name")
	String name;
	@Column(name="email")
	String email;
	@Column(name="panno")
	String panno;
	@Column(name="pwd")
	String pass;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
