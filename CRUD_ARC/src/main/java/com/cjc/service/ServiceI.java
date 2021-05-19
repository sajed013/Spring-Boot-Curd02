package com.cjc.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.model.Student;


public interface ServiceI {

	public void saveStudent(Student s);
	public Iterable<Student> getData();
	public Optional<Student> get(int uid);
	public void delete(int uid);
	public Student find(String uname,String pass);
	

	
}
