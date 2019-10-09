/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import com.neu.dao.AddMovieDao;
import com.neu.pojo.Movie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


public class SearchController extends SimpleFormController {
    
    public SearchController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
     */
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
      Movie m = (Movie) command;
        ModelAndView mv = null;
        
        AddMovieDao addMovie = (AddMovieDao) getApplicationContext().getBean("movieDao");
        Movie movieSearch = addMovie.searchMovie(m.getId());
        
        if(movieSearch!=null){
            mv = new ModelAndView(getSuccessView(),"movieSearch",movieSearch);
        }
        else{
             mv = new ModelAndView("error");
        }
        return mv;       
        
    
    }
}
