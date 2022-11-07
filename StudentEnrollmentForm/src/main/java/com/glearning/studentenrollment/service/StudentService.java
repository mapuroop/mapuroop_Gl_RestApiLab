package com.glearning.studentenrollment.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.glearning.studentenrollment.entity.Student;
import com.glearning.studentenrollment.entity.Users;
import com.glearning.studentenrollment.repository.StudentRepository;
import com.glearning.studentenrollment.repository.UserRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository ;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
	
	@Autowired
	UserRepository userRepository;
	
	
	
	
	public Student addStudent(Student student,Users users) {
		Users users1=new Users();
		users1.setU_id(users.getU_id());
		users1.setUserName(users.getUserName());
		users1.setPassword(users.getPassword());
		users1.setRole(users.getRole());
		student.setUsers(users1);
	return this.studentRepository.save(student);
		
	}
	
	public Set<Student> fetchAllStudents(){
		return new HashSet<>(this.studentRepository.findAll());
		
	}
	
	public Student fetchStudentById(long studentId) {
		return this.studentRepository.getById(studentId);
		
	}
	public void deleteStudentByid(long studentId) {
		this.studentRepository.deleteById(studentId);
	}
	public void updateStudent(Student student) {
		this.studentRepository.save(student);
		
				
	}
	

}
