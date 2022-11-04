package security.generic.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.metamodel.model.domain.DomainType;
import org.hibernate.usertype.ParameterizedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.repository.query.parser.Part.Type;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import security.model.Student;
import security.service.Studentservice;


public class GenericdaoImpl<T>{
T ent;

Object o;

public GenericdaoImpl(T et){
	
	this.ent=et;
}
@Autowired
private Dto dto;

public Object getitsname() throws NoSuchFieldException, SecurityException {
   
	o=ent;
  if(o.getClass().getSimpleName().contains("dent")){
	  Student st=(Student) o;
	  dto.addstudent(st);
	  return st;
  }
  
  return o;
}
    
    }
    
    
    
