package com.example.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	@GetMapping("/")
	public String welcome()
	{
		return "Hello from TUF";
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents()
	{
		
		List<Student> ls = new ArrayList<>();
		ls = studentService.getAllStudents();
		return ls;
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable long id)
	{
		return studentService.getStudent(id);
	}
	
	@DeleteMapping("/deleteSrudent/{id}")
	public boolean deleteStudent(@PathVariable long id)
	{
		return studentService.deleteStudent(id);
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student std)
	{
		return studentService.addStudent(std);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student std)
	{
		return studentService.updateStudent(std);
	}	
}
