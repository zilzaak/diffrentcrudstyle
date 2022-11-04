package security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import security.dao.Servicedao;
import security.model.Student;

@Service
@Transactional
public class Serviceimpl implements Studentservice {
@Autowired
private Servicedao dao;

	@Override
	public void add(Student st) {
		// TODO Auto-generated method stub

		dao.savestudent(st);
	}

	@Override
	public List<Student> findall() {
		// TODO Auto-generated method stub
		return dao.findall();
	}


}
