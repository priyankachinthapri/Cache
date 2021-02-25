package com.example.springcache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springcache.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCacheApplicationTests {
	@Autowired
	StudentService s1;

	@Test
	public void contextLoads() {
	}

	@Test
	public void  m1() {
		
		s1.getStudentByID("1");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.getStudentByID("1");
	}
	
}
