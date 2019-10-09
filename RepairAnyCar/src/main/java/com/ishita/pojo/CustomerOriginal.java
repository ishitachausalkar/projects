package com.ishita.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class CustomerOriginal extends User {
	
	
	@Column
	@ManyToOne
	private ServiceCenter serviceCenter;
	@OneToMany(mappedBy = "vehicles")
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public ServiceCenter getServiceCenter() {
		return serviceCenter; 
	}

	public void setServiceCenter(ServiceCenter serviceCenter) {
		this.serviceCenter = serviceCenter;
	}
	
	
}
