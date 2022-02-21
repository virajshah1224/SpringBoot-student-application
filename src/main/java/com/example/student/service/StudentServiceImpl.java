package com.example.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
//	List<Student> ls;
	
	@Autowired
	StudentRepo studentRepo;
	
	public StudentServiceImpl() {

//		ls = new ArrayList<>();
//		ls.add(new Student(1,"viraj","dfs"));
//		ls.add(new Student(2,"jigar","gddg"));
//		ls.add(new Student(3,"shah","gfb"));
	}
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student getStudent(long id) {

//		for (int i = 0; i < ls.size(); i++) {
//			
//			if(ls.get(i).getId() == id)
//			{
//				return ls.get(i);
//			}
//		}
		return null;
	}

	@Override
	public Boolean deleteStudent(long id) {
		
//		for (int i = 0; i < ls.size(); i++) {
//			
//			if(ls.get(i).getId() == id)
//			{
//				return ls.remove(ls.get(i));
//			}
//		}
		return false;
	}

	@Override
	public Student addStudent(Student std) {

		return studentRepo.save(std);
//		ls.add(std);
//		return ls.get(ls.size()-1);
	}

	@Override
	public Student updateStudent(Student std) {

//		for (int i = 0; i < ls.size(); i++) {
//			
//			if(ls.get(i).getId() == std.getId())
//			{
//				ls.get(i).setName(std.getName());
//				ls.get(i).setEmailID(std.getEmailID());
//				return ls.get(i);
//			}
//		}
		return null;		
	}
}
