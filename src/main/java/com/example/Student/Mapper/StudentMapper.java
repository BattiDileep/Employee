package com.example.Student.Mapper;


import com.example.Student.DTO.StudentDTO;
import com.example.Student.Entity.Student;

public class StudentMapper {
	public static Student mapToStudent(StudentDTO studentdto) {
		return new Student(
				studentdto.getStudentId(),
				studentdto.getStudentName(),
				studentdto.getStudentAddress(),
				studentdto.getStudentMail());
	}
public static StudentDTO mapToStudentDTO(Student student) {
	return new StudentDTO(
			student.getStudentId(),
			student.getStudentName(),
			student.getStudentAddress(),
			student.getStudentMail());
}
}
