package com.example.Student.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
	
	private long studentId;
	private String studentName;
	private String studentAddress;
	private String studentMail;

}
