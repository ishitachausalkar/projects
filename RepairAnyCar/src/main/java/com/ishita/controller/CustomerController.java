package com.ishita.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ishita.dao.CustomerDAO;
import com.ishita.dao.ServiceCenterDAO;
import com.ishita.pojo.Customer;
import com.ishita.pojo.ServiceCenter;
import com.ishita.validation.CustomerValidation;

@Controller
@RequestMapping("/customer")
public class CustomerController {

//	private CustomerValidation customerValidation;

//	public CustomerController() {
//		
//	}
//	
//	@Autowired
//	public CustomerController(CustomerValidation customerValidation) {
//		this.customerValidation = customerValidation;
//	}
//	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewForm(Model model, Customer customer) {

		model.addAttribute("customer", customer);
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveForm(@ModelAttribute("customer") Customer customer, CustomerDAO customerDao, BindingResult br,
			HttpSession session, CustomerValidation customerValidation) {

		customerValidation.validate(customer, br);

		if (br.hasErrors()) {
			return "register";
		} else {
			customerDao.saveCustomer(customer);
			session.setAttribute("customer", customer);
			return "success";
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewLogin(HttpServletRequest request, Model model, Customer customer) {
		model.addAttribute("customer", customer);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("customer") Customer customer, Model model, CustomerDAO customerDao,
			HttpSession session, ServiceCenterDAO serviceCenterDAO, ServiceCenter serviceCenter) {

		String emailId = customer.getEmailAddress();
		String password = customer.getPassword();

		if (customer.getEmailAddress().equals("admin") && customer.getPassword().equals("admin")) {
			return new ModelAndView("adminHome");
		}

		else if (customer.getEmailAddress() != null && customer.getPassword() != null
				&& session.getAttribute("customer") == null && session.getAttribute("serviceCenter") == null) {
			customer = customerDao.customerLogin(customer);
			serviceCenter = serviceCenterDAO.getServiceCenter(emailId, password);

			if (customer != null) {
				session.setAttribute("customer", customer);
				session.setAttribute("customerId", customer.getCustomerId());

				return new ModelAndView("success", "customer", customer);
			} else if (serviceCenter != null) {
				session.setAttribute("serviceCenter", serviceCenter);
				session.setAttribute("serviceCenterId", serviceCenter.getServiceCenterId());
				return new ModelAndView("serviceCenterView", "serviceCenter", serviceCenter);
			}

			else {
				model.addAttribute("failed", "Login Failed");
				return new ModelAndView("login", "customer", new Customer());
			}
		} else {
			return new ModelAndView("login", "customer", new Customer());
		}

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, HttpSession session) {

		session.invalidate();
		return "redirect: login";

	}

	// Used to redirect to success.jsp
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String successView(Model model, HttpSession session) {

		model.addAttribute("success", new Customer());
		return "success";
	}
}
