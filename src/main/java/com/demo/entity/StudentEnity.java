package com.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_record")
public class StudentEnity {

	@Override
	public String toString() {
		return "StudentEnity [id=" + id + ", sName=" + sName + ", lName=" + lName + ", rollNo=" + rollNo
				+ ", laptopEntity=" + laptopEntity + "]";
	}
	public StudentEnity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEnity(long id, String sName, String lName, long rollNo,
			List<com.demo.entity.laptopEntity> laptopEntity) {
		super();
		this.id = id;
		this.sName = sName;
		this.lName = lName;
		this.rollNo = rollNo;
		this.laptopEntity = laptopEntity;
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
	public List<laptopEntity> getLaptopEntity() {
		return laptopEntity;
	}
	public void setLaptopEntity(List<laptopEntity> laptopEntity) {
		this.laptopEntity = laptopEntity;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String sName;
	private String lName;
	private long rollNo;
	@OneToMany
	private List<laptopEntity> laptopEntity;
}
