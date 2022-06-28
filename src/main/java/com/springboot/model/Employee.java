package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String email;
	private String enumb;
	private String eadd;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnumb() {
		return enumb;
	}
	public void setEnumb(String enumb) {
		this.enumb = enumb;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public Employee(int eid, String ename, String email, String enumb, String eadd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.enumb = enumb;
		this.eadd = eadd;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", enumb=" + enumb + ", eadd=" + eadd
				+ "]";
	}
	
	

}
