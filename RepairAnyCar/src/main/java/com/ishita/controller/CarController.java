package com.ishita.controller;

import javax.servlet.http.HttpSession;
import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ishita.dao.CustomerDAO;
import com.ishita.dao.VehicleDAO;
import com.ishita.pojo.Customer;
import com.ishita.pojo.Vehicle;
import com.ishita.validation.CustomerValidation;

@Controller
@RequestMapping("/car")
public class CarController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewCarForm(Model model, Customer customer, Vehicle vehicle) {
		
		model.addAttribute("vehicle", vehicle);
		model.addAttribute("customer", customer);
	
		return "car";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String carRegister(@ModelAttribute("vehicle") Vehicle vehicle, VehicleDAO vehicleDao ,BindingResult br, HttpSession session,CustomerValidation customerValidation, Model model, CustomerDAO customerDao) {
		
		int id = (Integer) session.getAttribute("customerId");
		Customer customer = (Customer)session.getAttribute("customer");
		vehicle.setCustomer(customer);
		customer.getVehicles().add(vehicle);
		vehicleDao.saveVehicle(vehicle);
		customerDao.saveAndUpdate(customer);
		
		session.setAttribute("customer", customer);
		model.addAttribute("vehicle", vehicle);
		//model.addAttribute("customer", customer);
		
		
		return "success";
//		
//		customer.getVehicles().add(customer.getVehicles())
		
		
		
	}
	
}
