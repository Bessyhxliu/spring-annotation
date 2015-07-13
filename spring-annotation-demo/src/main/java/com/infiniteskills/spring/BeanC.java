package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class BeanC {

	private String message;

	public String getMessage() {
		return message;
	}
	
	//@Autowired
	//public void setMessage(@Value("Autowaring BeanC with string message ")String message) {
	public void setMessage(String message) {
		this.message = message;
	}
}
