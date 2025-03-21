package com.backend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.entity.Student;
import com.backend.service.StudentService;
@RestController
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/Student")
	public List <Student> getAllStudent(){
		return service.getAllStudent();
	}
}
