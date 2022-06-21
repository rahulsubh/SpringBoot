package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.StudentEnity;
import com.demo.model.StudentModel;
import com.demo.repo.StudentRepo;
import com.demo.service.StudentService;


@Service
public class StudentImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public StudentEnity insert(StudentModel studentModel) {
		// TODO Auto-generated method stub
		StudentEnity enity=new StudentEnity();
		enity.setlName(studentModel.getlName());
		enity.setsName(studentModel.getsName());
		enity.setRollNo(studentModel.getRollNo());
		return this.studentRepo.save(enity);
	}

	@Override
	public StudentEnity update(StudentModel studentModel) {
		// TODO Auto-generated method stub
		StudentEnity enity=new StudentEnity();
		enity.setId(studentModel.getId());
		enity.setlName(studentModel.getlName());
		enity.setsName(studentModel.getsName());
		enity.setRollNo(studentModel.getRollNo());
		return this.studentRepo.save(enity);
	}

	@Override
	public List<StudentEnity> getAllData() {
		// TODO Auto-generated method stub
		return this.studentRepo.findAll();
	}

	@Override
	public StudentEnity getById(long id) {
		// TODO Auto-generated method stub
		return this.studentRepo.findById(id).get();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		this.studentRepo.deleteById(id);
	}

}
