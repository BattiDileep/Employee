package com.example.Student.Rest;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.DTO.StudentDTO;
import com.example.Student.Entity.Student;
import com.example.Student.Service.StudentService;
@RestController
@RequestMapping("API/Student")
public class StudentRest {
	@Autowired
	StudentService stdntsrvc;
	@PostMapping
	public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentdto){
		StudentDTO savedstudent=stdntsrvc.createStudent(studentdto);
		return new ResponseEntity<>(savedstudent,HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	public ResponseEntity<StudentDTO> getStudentById(@PathVariable("id") Long studentId){
		StudentDTO studentdto= stdntsrvc.getStudentById(studentId);
		return ResponseEntity.ok(studentdto);
	}
	@GetMapping
	public ResponseEntity<List<StudentDTO>> getStudents(){
		List<StudentDTO> students= stdntsrvc.getAllStudents();
		return ResponseEntity.ok(students);
	}
}
