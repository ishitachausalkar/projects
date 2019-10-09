package com.ishita.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class ServiceCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ServiceCenterId;

	private String emailId;
	private String password;
	private String role = "serviceCenter";
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(name = "ServiceCenter_Services", joinColumns = {
			@JoinColumn(name = "ServiceCenterId") }, inverseJoinColumns = { @JoinColumn(name = "serviceId") })
	private List<Services> services;

	@OneToMany(mappedBy = "serviceCenter", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private List<Customer> customer;

	@Column
	private String serviceCenterName;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "addressId")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Address address;

	@OneToMany(mappedBy = "serviceCenter")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Booking> booking = new ArrayList<Booking>();

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setServiceCenterId(int serviceCenterId) {
		this.ServiceCenterId = serviceCenterId;
	}

	public int getServiceCenterId() {
		return ServiceCenterId;
	}

	public String getServiceCenterName() {
		return serviceCenterName;
	}

	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Services> getServices() {
		return services;
	}

	public void setServices(List<Services> services) {
		this.services = services;
	}

}
