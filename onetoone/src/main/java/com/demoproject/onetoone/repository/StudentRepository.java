package com.demoproject.onetoone.repository;

import com.demoproject.onetoone.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends CrudRepository<Student,Long> {
}
