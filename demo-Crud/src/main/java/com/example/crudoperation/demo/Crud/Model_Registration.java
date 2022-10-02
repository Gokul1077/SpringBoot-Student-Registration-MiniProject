package com.example.crudoperation.demo.Crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="StudentRegistration")
public class Model_Registration {
	
	@Id//primary Key
	@GeneratedValue(strategy = GenerationType.SEQUENCE)//generate automatic value
	@Column(name="Student_Id")
	private int studentId;
	
	@Column(name="Student_Name")
	private String studentName;
	
	@Column(name="Department_Name")
	private String Department;
	
	@Column(name="Student_Address")
	private String Address;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
/*localhost:8080/homepage/register 
 * {
 "studentName":"Vijay"
  "Department":"IT"
  "Address":"Polur"
}*/
}
