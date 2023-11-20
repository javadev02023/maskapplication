package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Employee;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/api/")
public class TestController {
	Logger log=LoggerFactory.getLogger(TestController.class);
	@GetMapping("/test")
	public String test() {
		String password = "abc";
		Integer creditCard = 123445555;
		log.info("Inside MessageController getMessage() method password=" + password);
		log.info("this is user password:" + password);
		log.info("this is user creditCard=" + creditCard);
		log.info("card context set for creditCard=" + creditCard);

		/*
		 * User user = new User("abc", "secure", 123456); log.info("Request Model : " +
		 * user); String jsonMessage = getJSONMessage();
		 * System.out.println("=================START==========");
		 * log.info("Request ===> : "+jsonMessage);
		 * System.out.println("=================END==========");
		 */
		return "Log masking done. Please verify on console.";
		
	}
	@GetMapping("/employees")
	public ResponseEntity<Object> getEmployees() {
		Employee emp=new Employee();
		emp.setAccountNumber("123456789");
		emp.setName("Anil Kumar");
		emp.setAge(23);
		emp.setEmail("abc@gmail.com");
		emp.setPassword("abcdef");
		Employee emp1=new Employee();
		emp1.setAccountNumber("323456789");
		emp1.setName("Anil2 Singh");
		emp1.setAge(25);
		emp1.setEmail("abc@gmail.com");
		emp1.setPassword("cccdef");
		Employee emp2=new Employee();
		emp2.setAccountNumber("423456789");
		emp2.setName("Anil3 Pal Singh");
		emp2.setAge(25);
		emp2.setEmail("abc@gmail.com");
		emp2.setPassword("oocdef");
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);		
		log.info("list :"+list);
		return new ResponseEntity<>(list, HttpStatus.OK); 
	}

}
