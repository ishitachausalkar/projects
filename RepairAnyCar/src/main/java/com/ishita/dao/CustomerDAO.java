package com.ishita.dao;

import java.util.List;

import org.hibernate.Query;

import com.ishita.pojo.Booking;
import com.ishita.pojo.Customer;
import com.ishita.pojo.Vehicle;

public class CustomerDAO extends DAO {

	
	public void saveCustomer(Customer customer) {
		try {
		begin();
		
		getSession().save(customer);
		getSession().getTransaction().commit();
		close();
		}
		catch(Exception e) {
			rollback();
			close();
		}
	}
	
	public Customer customerLogin(Customer customer) {
		
		String hql = "from Customer as c where c.emailAddress=:email and c.password=:pwd";
		try {
			begin();
			
		Query query = getSession().createQuery(hql);
		query.setString("email", customer.getEmailAddress());
		query.setString("pwd", customer.getPassword());
		customer = (Customer)query.uniqueResult();
			//System.out.println("CUSTOMERS......."+results);
			
			commit();
			close();
		}
		catch(Exception e) {
			rollback();
			close();
		}
		
		return customer;
	}
	
	public void saveAndUpdate(Customer customer) {
		try {
			begin();
			getSession().saveOrUpdate(customer);
			getSession().getTransaction().commit();
			close();
			
		}
		catch(Exception e) {
			rollback();
			close();
		}
	}
	
//	public void saveVehicle(Vehicle vehicle, Customer customer) {
//		
//		customerLogin(customer);
//		try {
//			begin();
//			getSession().save(object)
//		}
//	}
	
//	public Customer get(Customer customer) {
//		String hql = "from Customer as c where c.emailAddress =:emailAddress and c.password=: password";
//		try {
//			begin();
//			Query query = getSession().createQuery(hql);
//			query.setParameter("emailAddress", customer.getEmailAddress());
//			query.setParameter("password", customer.getPassword());
//			customer = (Customer)query.uniqueResult();
//			
//			customer.getVehicles().add(e);
//		}
//	}
	

}
