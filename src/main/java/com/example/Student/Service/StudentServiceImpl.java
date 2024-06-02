package com.example.Student.Service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.DTO.StudentDTO;
import com.example.Student.Entity.Student;
import com.example.Student.Exception.StudenyNotFoundException;
import com.example.Student.Mapper.StudentMapper;
import com.example.Student.Repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo stdntrepo;

	@Override
	public StudentDTO createStudent(StudentDTO studentdto) {
		Student student=StudentMapper.mapToStudent(studentdto);
		Student savedstudent=stdntrepo.save(student);
		return StudentMapper.mapToStudentDTO(savedstudent);
	}

	@Override
	public StudentDTO getStudentById(Long studentId) {
		Student student=stdntrepo.findById(studentId)
				.orElseThrow(() -> new StudenyNotFoundException("StudenyNotFoundException :"+studentId));
		return StudentMapper.mapToStudentDTO(student);
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		List<Student> students= stdntrepo.findAll();
		return students.stream().map((n) ->StudentMapper.mapToStudentDTO(n))
				.collect(Collectors.toList());
}
}
