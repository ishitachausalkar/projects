package com.ishita.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ishita.dao.CustomerDAO;
import com.ishita.dao.ServiceCenterDAO;
import com.ishita.pojo.Booking;
import com.ishita.pojo.Customer;
import com.ishita.pojo.ServiceCenter;

@Controller
@RequestMapping("/serviceCenter")
public class ServiceCenterController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String serviceCenter(@ModelAttribute("serviceCenter") ServiceCenter serviceCenter,
			ServiceCenterDAO serviceCenterDao, Model model, HttpSession session) {
		List<ServiceCenter> list = serviceCenterDao.serviceCenterList();
		model.addAttribute(list);
		session.setAttribute("list", list);
		return "ServiceCenterList";
	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET, params = "serviceCenterId")
	public String serviceCenterDashboard(@RequestParam(value = "serviceCenterId") int serviceCenterId,
			@ModelAttribute("serviceCenter") ServiceCenter serviceCenter, HttpSession session, Model model,
			ServiceCenterDAO serviceCenterDAO) {
		serviceCenter = serviceCenterDAO.serviceCenterDashboad(serviceCenterId);
		session.setAttribute("serviceCenter", serviceCenter);
		model.addAttribute("serviceCenter", serviceCenter);
//		String serviceCenterName = serviceCenter.getServiceCenterName();
		// System.out.println(serviceCenterId);
		return "serviceCenterDashboard";
	}

	@RequestMapping(value = "/serviceForm", method = RequestMethod.GET)
	public String viewServiceForm(@ModelAttribute("booking") Booking booking, Model model, HttpSession session) {
		model.addAttribute("booking", booking);
		// Customer c = (Customer) session.getAttribute("customer");
		return "serviceBook";
	}

	@RequestMapping(value = "/serviceForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("booking") Booking booking, Customer customer, HttpSession session,
			CustomerDAO customerDao, ServiceCenterDAO serviceCenterDao) {

		String appointmentDate = booking.getAppointmentTime();

		// get customer object from session
		// get service center from session
		Customer customerSession = ((Customer) session.getAttribute("customer"));
		ServiceCenter serviceCenterSession = (ServiceCenter) session.getAttribute("serviceCenter");

		booking.setStatus("Pending");
		booking.setCustomer(customerSession);
		booking.setServiceCenter(serviceCenterSession);
		session.setAttribute("booking", booking);

		serviceCenterSession.getBooking().add(booking);
		customerSession.getBooking().add(booking);
		booking.setStatus("Pending");

		serviceCenterDao.booking(booking);

		customerDao.saveAndUpdate(customerSession);
		serviceCenterDao.saveOrUpdate(serviceCenterSession);

		// persist both in db

		session.setAttribute("customer", customerSession);
		session.setAttribute("serviceCenter", serviceCenterSession);

		System.out.println(appointmentDate);
		return "bookingSuccess";
	}

}
