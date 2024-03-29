package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;



@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@GetMapping("/view")
	public List<Student> getAllEmployees()
	{
		
		List<Student> lstEmp= repo.findAll();
		
		return lstEmp;
		
	}
	
	@PostMapping("/enter")
	public void  addEmployee(@RequestBody Student emp)
	{
		repo.save(emp);
		
	}
	
	@DeleteMapping("/change")
	public Student updateEmployee(@PathVariable int id)
	{
		return null;
	}

}
