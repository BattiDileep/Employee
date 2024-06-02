package com.example.Student.Service;

import java.util.List;

import com.example.Student.DTO.StudentDTO;

public interface StudentService {
	
	public StudentDTO createStudent(StudentDTO studentdto);
	public StudentDTO getStudentById(Long studentId);
	public List<StudentDTO> getAllStudents();

}
