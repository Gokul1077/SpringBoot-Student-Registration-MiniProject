package com.example.crudoperation.demo.Crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	JPARepo jpa;
	
	public Model_Registration insertdata(Model_Registration mr) {
		return this.jpa.save(mr);
	}
	//get complete records in the table
	public List<Model_Registration> getAllRecords(){
		return this.jpa.findAll();
	}
	
	//get a single record from the table
	public Optional<Model_Registration> getsingleRecord(Integer id) {
		return this.jpa.findById(id);
	}
	
	//update a record in the table
	public Model_Registration updateData(Integer id,Model_Registration mr) {
		Model_Registration oldData=this.jpa.findById(id).orElseThrow(()->new ResourceNotFoundException("User data not found!"));
		oldData.setStudentName(mr.getStudentName());
		oldData.setDepartment(mr.getDepartment());
		oldData.setAddress(mr.getAddress());
		return this.jpa.save(oldData);
	}
}
