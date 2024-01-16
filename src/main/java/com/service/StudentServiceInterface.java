package com.service;

import java.util.List;

import com.model.Student;

public interface StudentServiceInterface {

	public Student saveStudent(Student s);
	
	public Student getOneStudent(int id);
	
	public List<Student> getAllStudent();
	
	public void deleteStudent(int id);
	
	public Student updateStudent(Student s);
	
	
}
