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


public class SearchValidate implements Validator{
    
    @Override
    public boolean supports(Class<?> type) {
        return Movie.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Movie m = (Movie) o;
        
        if (m.getId() == 0){
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required.id", "id is required");
        }
        
        
        
    }
    
}
