package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Moodel.StudentModel;
import com.example.demo.repositary.PersonRepositary;

@Service
public class StudentService {

	@Autowired
	private PersonRepositary repositary;

	public StudentModel addStudent(StudentModel student) {
		return repositary.save(student);
	}

	public List<StudentModel> getAllStudents(Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<StudentModel> page = repositary.findAll(paging);

		if (page.hasContent()) {
			return page.getContent();
		} else {
			return new ArrayList<StudentModel>();
		}
	}
}
