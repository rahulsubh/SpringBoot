package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.StudentEnity;
import com.demo.model.StudentModel;
import com.demo.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/")
	public StudentEnity insert(@RequestBody StudentModel enity) {
		return this.service.insert(enity);
	}
	
	
	@PutMapping("/")
	public StudentEnity update(@RequestBody StudentModel enity) {
		return this.service.insert(enity);
	}
	
	@GetMapping("/")
	public List<StudentEnity> getAllData(){
		return this.service.getAllData();
	}
	
	@GetMapping("/{id}")
	public StudentEnity getById(@PathVariable("id") long id) {
		
		System.err.println("line no 46 "+id);
		return this.service.getById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long id) {
		this.service.deleteById(id);
	}
	
}
