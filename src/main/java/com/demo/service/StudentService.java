package com.demo.service;

import java.util.List;

import com.demo.entity.StudentEnity;
import com.demo.model.StudentModel;

public interface StudentService {

	public StudentEnity insert(StudentModel studentModel);
	
	public StudentEnity update(StudentModel studentModel);
	
	public List<StudentEnity> getAllData();
	
	public StudentEnity getById(long id);
	
	public void deleteById(long id);
	
}
