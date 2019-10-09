/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import com.neu.pojo.Movie;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class AddValidator implements Validator {
    
    @Override
    public boolean supports(Class<?> type) {
       return Movie.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "required.title", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "actor", "required.actor", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "actress", "required.actress", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genre", "required.genre", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "year", "required.year", "required");
    }
    
}
