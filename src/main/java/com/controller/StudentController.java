package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Student;
import com.service.StudentServiceInterface;

@RestController
@RequestMapping("/s")
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {

	@Autowired
	StudentServiceInterface studentService;
	
	@PostMapping("/save")
    public Student addStudent(@RequestBody Student s) {
		
		return studentService.saveStudent(s);
	}
	
    @GetMapping("/getOne/{id}")
	public Student getOneStudent( @PathVariable int id) {
		
		return studentService.getOneStudent(id);
	}
    
   
    @GetMapping("/getAll")
    public List<Student> findgetAllStudent() {
		
		return studentService.getAllStudent();
	}
    
    @DeleteMapping("/deletebyid/{id}")
    public void deleteStudent( @PathVariable int id) {
		studentService.deleteStudent(id);;
		
	}
    
    @PutMapping("update")
	public Student updateStudent( @RequestBody Student s) {
		
		return studentService.updateStudent(s);
			
	}
}
