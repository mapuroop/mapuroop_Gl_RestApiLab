package com.glearning.studentenrollment.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.jaas.AuthorityGranter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.glearning.studentenrollment.entity.Student;
import com.glearning.studentenrollment.entity.Users;
import com.glearning.studentenrollment.service.StudentService;


@Controller

public class StudentController {
	
	StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService=studentService;
	}
	
	@GetMapping("/addStudent")
	public String addStu() {
		return "add-student";
	}
	
	//Add Student Data
		@PostMapping("/insertStudent")
		public String insertStudent(@ModelAttribute ("insertStudent") Student student,Users users) {
			studentService.addStudent(student,users);
			return "redirect:/studentReport";
			}
		
		
		@GetMapping("/studentReport")
		public String loadStudent(Model theModel) {
			theModel.addAttribute("student", studentService.fetchAllStudents());
			theModel.addAttribute("title","Student Report");
			return "student-report";
		}
		
		@GetMapping("/editStudent/{id}")
		public String editStudent(@PathVariable(value="id") Long id,Model m) {
			Student stu=studentService.fetchStudentById(id);
			m.addAttribute("student",stu);
			m.addAttribute("title","Edit Student");
			
			return "edit-student";
		}
		
		@PostMapping("/editStudent/updateStudent")
		public String UpdateStudent(@ModelAttribute("updateStudent") Student stu) {
			studentService.updateStudent(stu);
			return "redirect:/studentReport";
		}
	
		@GetMapping("/deleteStudent/{id}")
		public String deleteStudent(@PathVariable Long id) {
			studentService.deleteStudentByid(id);
			return "redirect:/studentReport";
	}

}
