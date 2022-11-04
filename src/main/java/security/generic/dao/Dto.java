package security.generic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.model.Student;
import security.service.Studentservice;

@Service
public class Dto {
	@Autowired
	private Studentservice srvc;
	
	
	
	public void addstudent(Student st) {
		
		srvc.add(st);
	}

}
