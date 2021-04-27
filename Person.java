package com.te.personpass;

public class Person
{
	private int pid;
	private String pname;
	private Passport passport;
	
	
	public Person() {
		
	}
	public Person(int pid, String pname, Passport passport) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.passport = passport;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	

}
