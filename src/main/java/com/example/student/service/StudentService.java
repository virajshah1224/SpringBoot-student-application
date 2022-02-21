package com.example.student.service;

import java.util.List;

import com.example.student.entity.Student;

public interface StudentService {

	
	public List<Student> getAllStudents();
	public Student getStudent(long id);
	public Boolean deleteStudent(long id);
	
	public Student addStudent(Student std);
	public Student updateStudent(Student std);
}
