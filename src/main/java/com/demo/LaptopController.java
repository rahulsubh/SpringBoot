package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.StudentEnity;
import com.demo.entity.laptopEntity;
import com.demo.model.LaptopModel;
import com.demo.repo.LapotpRepo;
import com.demo.repo.StudentRepo;

@RestController
@CrossOrigin
@RequestMapping("/laptop")
public class LaptopController {
	
	@Autowired
	private LapotpRepo lapotpRepo;
	
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/")
	public laptopEntity entity(@RequestBody LaptopModel laptopModel) {
		
		laptopEntity entity=new laptopEntity();
		entity.setLaptopName(laptopModel.getLaptopName());
		this.lapotpRepo.save(entity);
		
		StudentEnity studentEnity = this.studentRepo.findById(laptopModel.getStudentId()).get();
		List<laptopEntity> laptopList=new ArrayList<laptopEntity>();
		laptopList.add(entity);
		
		for(laptopEntity l:studentEnity.getLaptopEntity()) {
			System.out.println("lino no 40 "+l);
			laptopList.add(l);
		}
		studentEnity.setLaptopEntity(laptopList);
		this.studentRepo.save(studentEnity);
		return entity;
	}
	
	
	@GetMapping("/")
	public List<laptopEntity> list(){
		return this.lapotpRepo.findAll();
	}
	
}
