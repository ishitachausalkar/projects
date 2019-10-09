package com.ishita.validation;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ishita.pojo.Customer;



public class CustomerValidation implements Validator {
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return Customer.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailAddress", "error.emailAddress", "Email is required");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.password", "password is required");
	}


}
