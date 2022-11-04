package security.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import security.model.Student;
@Repository
public class Servicedaoimpl implements Servicedao {
@PersistenceContext
private EntityManager em;
	@Override
	public void savestudent(Student st) {
		Session session = em.unwrap(Session.class);
		//em.persist(st);
		session.save(st);
		session.close();
		
	}
	
	
	@Override
	public List<Student> findall() {
		// TODO Auto-generated method stub
	 Session session = em.unwrap(Session.class); 
	 System.out.println("omare borkan al galadfsdfg");
	return  session.createQuery("from Student").list();
	}


}
