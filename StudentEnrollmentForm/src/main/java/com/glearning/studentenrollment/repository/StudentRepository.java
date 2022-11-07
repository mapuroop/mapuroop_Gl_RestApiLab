package com.glearning.studentenrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.studentenrollment.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
