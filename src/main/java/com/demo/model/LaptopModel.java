package com.demo.model;

public class LaptopModel {

	@Override
	public String toString() {
		return "LaptopModel [id=" + id + ", studentId=" + studentId + ", laptopName=" + laptopName + "]";
	}
	
	public LaptopModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LaptopModel(long id, long studentId, String laptopName) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.laptopName = laptopName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	private long id;
	private long studentId;
	private String laptopName;
	
}
