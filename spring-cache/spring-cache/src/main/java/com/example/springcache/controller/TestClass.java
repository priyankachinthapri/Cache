package com.example.springcache.controller;

import org.springframework.stereotype.Component;

import com.example.springcache.domain.Student;

@Component
public class TestClass {
	
	public Student getStudentDetails(String id) {
		
		System.out.println("coming here");
		return new Student(id, "priyanka", "10");
	}
	

}
