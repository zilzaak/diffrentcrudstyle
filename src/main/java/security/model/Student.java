package security.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//use fetch type lazzy and dont use cascadetype other wise the dbms will very slow

@Entity
@Table
public class Student{
    private long sid;
    private String studentname;
    
    @Id
    @GeneratedValue
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Student(String studentname) {
		super();
		this.studentname = studentname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
 
    
}