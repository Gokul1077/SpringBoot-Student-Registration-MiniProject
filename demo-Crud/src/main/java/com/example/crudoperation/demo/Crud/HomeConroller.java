package com.example.crudoperation.demo.Crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/homepage")
public class HomeConroller {
	@GetMapping("/getinfo")
	public String getUserInfo() {
		return "Welcome to Spring Boot";
	}
	
	@GetMapping("/getusername/{name}")
	public String getUserName(@PathVariable (value="name") String n){
		return "Hai!"+n;
	}
	//with 2 Paramters for pathvariable
	@GetMapping("/getusername/{name}/{product}")
	public String getUserprd(@PathVariable (value="name") String n,@PathVariable(value="product") String prd){
		return "Customer Name : "+n+"\n"+"Product Recieved : "+prd;
	}
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/register")
	public Model_Registration addValues(@RequestBody Model_Registration mr) {
		return this.ss.insertdata(mr);
	}
	
	
	@GetMapping("/getallrecords")
	public List<Model_Registration> allrecords() {
		return this.ss.getAllRecords();
	}
	
	@GetMapping("/getrecord/{id}")
	public Optional<Model_Registration> singlerecords(@PathVariable (value="id") Integer Id) {
		return this.ss.getsingleRecord(Id);
	}
	
	
	@PutMapping("/updaterecords/{id}")
	public  Model_Registration addnewValue(@PathVariable (value="id") Integer Id
			,@RequestBody Model_Registration mr) {
		return this.ss.updateData(Id,mr);
	}
}
