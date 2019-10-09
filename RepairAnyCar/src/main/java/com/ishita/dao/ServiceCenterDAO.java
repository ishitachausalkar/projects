package com.ishita.dao;

import java.util.List;

import org.hibernate.Query;

import com.ishita.pojo.Booking;
import com.ishita.pojo.ServiceCenter;

public class ServiceCenterDAO extends DAO {

	public List<ServiceCenter> serviceCenterList() {

		String hql = "from ServiceCenter";
		List<ServiceCenter> list = null;
		try {
			begin();
			Query query = getSession().createQuery(hql);
			list = (List<ServiceCenter>) query.list();
			commit();
			close();
		} catch (Exception e) {
			rollback();
			close();
		}
		return list;
	}

	public ServiceCenter serviceCenterDashboad(int serviceCenterId) {

		String hql = "from ServiceCenter as s where s.ServiceCenterId = ?";
		ServiceCenter serviceCenter = null;
		try {
			begin();
			Query query = getSession().createQuery(hql);
			query.setInteger(0, serviceCenterId);
			serviceCenter = (ServiceCenter) query.uniqueResult();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}

		return serviceCenter;
	}

	public void saveOrUpdate(ServiceCenter serviceCenter) {

		try {
			begin();
			getSession().saveOrUpdate(serviceCenter);
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}
	}

	public void booking(Booking booking) {
		try {
			begin();
			getSession().save(booking);
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}
	}

	public void saveServiceCenter(ServiceCenter serviceCenter) {
		try {
			begin();
			getSession().save(serviceCenter);
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}
	}

	public ServiceCenter getServiceCenter(String emailId, String password) {

		String hql = "from ServiceCenter as s where s.emailId=:emailId and s.password=:password";
		ServiceCenter serviceCenter = null;
		try {
			begin();
			Query query = getSession().createQuery(hql);
			query.setParameter("emailId", emailId);
			query.setParameter("password", password);
			serviceCenter = (ServiceCenter) query.uniqueResult();
			commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception

			rollback();
			close();
		}

		return serviceCenter;
	}

	public List<Booking> getBooking(int serviceCenterId) {

		String hql = "from Booking as b where b.serviceCenter.ServiceCenterId=:serviceCenterId";
		List<Booking> booking = null;

		try {
			begin();
			Query query = getSession().createQuery(hql);
			query.setParameter("serviceCenterId", serviceCenterId);
			booking = (List<Booking>) query.list();
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}
		return booking;
	}

	public Booking getCustomerBooking(int bookingId) {
		String hql = "from Booking as b where b.bookingId=:bookingId";
		Booking booking = null;

		try {
			begin();
			Query query = getSession().createQuery(hql);
			query.setParameter("bookingId", bookingId);
			booking = (Booking) query.uniqueResult();
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}
		return booking;
	}

	public void updateBooking(Booking booking) {

		try {
			begin();
			getSession().saveOrUpdate(booking);
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}
	}

}
