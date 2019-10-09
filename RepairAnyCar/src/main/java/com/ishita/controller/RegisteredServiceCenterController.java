package com.ishita.controller;

import java.util.ArrayList;
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
import com.ishita.dao.VehicleDAO;
import com.ishita.pojo.Booking;
import com.ishita.pojo.Customer;
import com.ishita.pojo.Vehicle;

@Controller
@RequestMapping("/partner")
public class RegisteredServiceCenterController {

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String viewDashboard() {
		return "partnerDashboard";
	}

	@RequestMapping(value = "/request", method = RequestMethod.GET)
	public String viewRequest(@ModelAttribute("booking") Booking booking, Model model, HttpSession session,
			ServiceCenterDAO serviceCenterDAO, VehicleDAO vehicleDAO) {

		List<Vehicle> vehiclesToService = new ArrayList<Vehicle>();
		List<Booking> bookings = new ArrayList<Booking>();
		int serviceCenterId = (Integer) session.getAttribute("serviceCenterId");
		bookings = serviceCenterDAO.getBooking(serviceCenterId);

		for (Booking b : bookings) {
			String vehicleNumber = b.getVechileNumber();
			Vehicle vehicle = vehicleDAO.getVehicle(vehicleNumber);
			vehiclesToService.add(vehicle);
		}

		model.addAttribute("vehicleToSerivce", vehiclesToService);
		model.addAttribute("bookings", bookings);
		session.setAttribute("bookings", bookings);
		return "partnerRequestView";
	}

	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String requestCompleted(@RequestParam("bookingId") int bookingId, ServiceCenterDAO serviceCenterDAO,
			Booking booking, HttpSession session, CustomerDAO customerDAO) {

		booking = serviceCenterDAO.getCustomerBooking(bookingId);
		booking.setStatus("Completed");
		Customer customer = booking.getCustomer();

		customer.getBooking().add(booking);
		customerDAO.saveAndUpdate(customer);
		session.setAttribute("customer", customer);
		serviceCenterDAO.updateBooking(booking);
		System.out.println(bookingId);
		return "requestCompleted";
	}
}
