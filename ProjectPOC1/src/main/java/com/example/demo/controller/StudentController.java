package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Moodel.StudentModel;
import com.example.demo.service.StudentService;

@RestController


@RequestMapping("api/StudentModel")
public class StudentController {

	@RequestMapping("/hello")
	public String hello()
	{
		return"index.jsp";
	}
	
	@Autowired
	 StudentService studentservice;
	
	@GetMapping("/display")
	public ResponseEntity<List<StudentModel>>getAllStudents(@RequestParam(defaultValue="0")Integer pageNo,@RequestParam(defaultValue="4")Integer pageSize) {
		List<StudentModel>list=studentservice.getAllStudents(pageSize, pageSize);
		return new ResponseEntity<List<StudentModel>>(list, new HttpHeaders(),HttpStatus.OK);
	}
	@PostMapping("/add")
	public StudentModel addStudent(@RequestBody StudentModel ticket) {
		return studentservice.addStudent(ticket);
	}
}
