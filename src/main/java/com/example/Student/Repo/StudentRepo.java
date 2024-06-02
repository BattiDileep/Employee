package com.example.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
