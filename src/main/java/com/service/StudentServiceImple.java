package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentServiceImple implements StudentServiceInterface {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student s) {
		
		return studentRepo.save(s);
	}

	@Override
	public Student getOneStudent(int id) {
		
		return studentRepo.findById(id).orElse(null);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student s) {
		
		Student existStudent=studentRepo.findById(s.getId()).orElse(null);
		existStudent.setName(s.getName());
		return studentRepo.save(existStudent);
	}

}
