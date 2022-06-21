package com.demo.model;

public class StudentModel {
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", sName=" + sName + ", lName=" + lName + ", rollNo=" + rollNo + "]";
	}
	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentModel(long id, String sName, String lName, long rollNo) {
		super();
		this.id = id;
		this.sName = sName;
		this.lName = lName;
		this.rollNo = rollNo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	
	private long id;
	private String sName;
	private String lName;
	private long rollNo;
	
}
