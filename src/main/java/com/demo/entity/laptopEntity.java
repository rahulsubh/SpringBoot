package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_list")
public class laptopEntity {

	@Override
	public String toString() {
		return "laptopEntity [id=" + id + ", laptopName=" + laptopName + "]";
	}
	
	public laptopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public laptopEntity(long id, String laptopName) {
		super();
		this.id = id;
		this.laptopName = laptopName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String laptopName;
}
