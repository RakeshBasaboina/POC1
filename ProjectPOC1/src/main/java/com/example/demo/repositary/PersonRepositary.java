package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Moodel.StudentModel;

@Repository
public interface PersonRepositary extends JpaRepository<StudentModel, Integer> {

}
