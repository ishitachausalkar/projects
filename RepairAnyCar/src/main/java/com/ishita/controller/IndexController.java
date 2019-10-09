package com.ishita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ishita.dao.CustomerDAO;

@Controller
public class IndexController {


	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String start() {
		
		return "index";
	}
	
//	@RequestMapping(value = "/search", method = RequestMethod.POST)
//	public ModelAndView search() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("ServiceCenterSearch");
//		return mv;
//	}
//	@RequestMapping(value = "/search", method = RequestMethod.GET )
//	public String search() {
//		
//		return "ServiceCenterSearch";
//	}
	
//	@RequestMapping(value = "/search" , method = RequestMethod.POST)
//	public String search() {
//		
//		return "ServiceCenterSearch";
//	}
}
