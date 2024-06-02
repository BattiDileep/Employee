package com.example.Student.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class StudenyNotFoundException extends RuntimeException{
	
	public StudenyNotFoundException(String message) {
		super(message);
	}

}
