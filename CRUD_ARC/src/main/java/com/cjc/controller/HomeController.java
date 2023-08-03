package com.cjc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	

	@RequestMapping("/getStudent")
	public Student get()
	{

	
		Student s=new Student();
		s.setRollno(11);
		s.setName("Chetan1");
		s.setCity("Nagar1");
		s.setUname("chetan1");
		s.setPass("chetan1");
		return s;
	}

	
	@RequestMapping("/getalldata")
	public Iterable<Student> insert()
	{

		Iterable<Student> i=si.getData();
		System.out.println(i);
		return i;
	}

	@RequestMapping("/getbyuserpass")
	public Student findby()
	{

	Student s=si.find("chetan","chetan");
	System.out.println(s.getRollno());
	System.out.println(s.getName());
	System.out.println(s.getCity());
	System.out.println(s.getUname());
	System.out.println(s.getPass());
		
	return s;
	}

	
	
	@RequestMapping("/getdatabyid/{uid}")
	public Optional<Student> get(@PathVariable("uid") int uid)
	{

		Optional<Student> s=si.get(uid);
		//System.out.println(i);
		return s;
	}

	@RequestMapping("/delete/{uid}")
	public String delete(@PathVariable("uid") int uid)
	{
 
		si.delete(uid);
		return "Deleted";
	
	}


	@RequestMapping("/postdata")
	public String insert(@RequestBody Student s)
	{
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getUname());
		System.out.println(s.getPass());
		
		si.saveStudent(s);
		return "Inserted";
	}

	
	@PutMapping("/update")
	public String update(@RequestBody Student s)
	{
	
		
		si.saveStudent(s);
		return "Updated";
	}
	
	
}
