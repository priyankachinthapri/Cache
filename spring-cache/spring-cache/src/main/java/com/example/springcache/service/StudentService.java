package com.example.springcache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.springcache.controller.TestClass;
import com.example.springcache.domain.Student;

@Service
public class StudentService {
	@Autowired
	private TestClass test;
	@Cacheable(value="student",key="'test'")
	public Student getStudentByID(String id) {
		
		
		return getStudentDetails(id);
		
	}
	public Student getStudentDetails(String id) {
		System.out.println("calling this method for id :"+id);
		return test.getStudentDetails(id);
	}
}
