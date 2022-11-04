package security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import security.generic.dao.GenericdaoImpl;
import security.model.Student;
import security.repository.Studrepo;
import security.service.Serviceimpl;
import security.service.Studentservice;

@RestController
public class Controll {
	@Autowired
	private Studentservice  srvc;
	
	
	
	
	@Autowired
	private Studrepo  srr;

/*	
	
	@GetMapping("/adddept")
	public void addfootall() {

Student st=new Student();
st.setStudentname("omar borkan");
Subject sb=new Subject();
sb.ListDeptname("bangla");

	
	Student st1=new Student();
	st1.setStudentname("omar borkan");
	Subject sb1=new Subject();
	sb1.ListDeptname("english");
	
	
	List<Student> sts=new ArrayList<Student>(); 
	sts.add(st);sts.add(st1);
	
	List<Subject> sbs=new ArrayList<Subject>(); sbs.add(sb);sbs.add(sb1);
	Student st3=new Student("omar borkan",sbs);
	Subject sb3=new Subject("bangla",sts);
	service.add(st3);
	service.adddept(sb3);
		
	}
	*/
	@GetMapping("/adddata")
	public Student adddata() {
    Student s=new Student();
	s.setStudentname("omar borkan al gala");
	//srvc.add(s);
	//or use new technique
	srr.save(s);
	return s;
	}
	
	@GetMapping("/all")
	public Object all() throws NoSuchFieldException, SecurityException {
		Student st=new Student("my name is omar borkan al gala okkk my baby");
		
GenericdaoImpl d =new GenericdaoImpl(st);
return d.getitsname();


	}
	
	
	
}
