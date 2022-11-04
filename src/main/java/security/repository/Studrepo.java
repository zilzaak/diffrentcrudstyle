package security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import security.model.Student;

public interface Studrepo extends JpaRepository<Student,Long> {

}
