package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.StudentDao;
import com.example.entity.Student;


@RestController
public class StudentController {
	
	@Autowired
	private StudentDao sdao;
	
	
	@PostMapping(value = "/addstudent", consumes = { "application/json" })
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		System.out.println(student);

		String mes = "save student data";
		sdao.save(student);

		return new ResponseEntity<String>(mes, HttpStatus.CREATED);


	}
	
	
	@GetMapping(value = "/get", consumes = { "application/json" })
	public List<Student> getAllstudent() {
		
		List<Student> list = sdao.findAll();
		return list;
		
		
	}
	
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@PathVariable int id) {
		
		Student student = sdao.findById(id).get();
		student.setId(102);
		student.setName("Shardul");
		student.setEmail("shardul@gmail.com");
		student.setMark(88);
		student.setAddress("Chennai");
		
		sdao.save(student);
		
		return student;
		
		
		
	}
	
	@DeleteMapping("student/delete/{id}")
	public Student deletestudent(@PathVariable int id) {
		
		Student student = sdao.findById(id).get();
		sdao.delete(student);
		
		return student;
	}
	
}
	

	
		


