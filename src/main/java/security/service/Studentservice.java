package security.service;



import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import security.model.Student;
public interface Studentservice {
	
	public void add(Student st);
	public List<Student> findall();

}
