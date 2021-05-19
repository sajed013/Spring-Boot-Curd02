package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public interface Crud_Repository extends CrudRepository<Student, Integer> {

	public Student findByUnameAndPass(String uname,String pass);
	
	
	
}
