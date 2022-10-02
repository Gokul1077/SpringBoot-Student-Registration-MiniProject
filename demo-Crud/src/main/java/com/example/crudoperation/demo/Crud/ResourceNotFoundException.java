package com.example.crudoperation.demo.Crud;

public class ResourceNotFoundException extends RuntimeException{
	ResourceNotFoundException(String error){
		super(error);
	}
}
