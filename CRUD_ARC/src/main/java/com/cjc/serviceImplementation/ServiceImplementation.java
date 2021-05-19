package com.cjc.serviceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.Crud_Repository;
import com.cjc.service.ServiceI;

@Service
public class ServiceImplementation implements ServiceI {
	
@Autowired
Crud_Repository cr;	



@Override
	public Student find(String uname, String pass) {
		// TODO Auto-generated method stub
		Student s= cr.findByUnameAndPass(uname, pass);

	
			return s;

}

	@Override
	public void saveStudent(Student s) {
	// TODO Auto-generated method stub
	cr.save(s);
}
	@Override
	public Iterable<Student> getData() {
		// TODO Auto-generated method stub
		return cr.findAll();

	}
	
	@Override
		public Optional<Student> get(int uid) {
			// TODO Auto-generated method stub
			return cr.findById(uid);
			
		}
	@Override
		public void delete(int uid) {
			// TODO Auto-generated method stub
			cr.deleteById(uid);
	
		}
}
