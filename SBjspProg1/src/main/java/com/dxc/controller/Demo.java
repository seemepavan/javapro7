package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dao.UserDao;
import com.dxc.model.Employee;

@RestController
public class Demo {
	   
	   @Autowired
	   UserDao dao;
         
	   @GetMapping("/")
	   public String view()
	   {
		   return "Hello";
	   }
	   
	   @PostMapping(path="data")
	   public String view1(Employee employee)
	   {
		   dao.save(employee);
		   return "data saved";
	   }
	   
}
