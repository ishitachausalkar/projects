package com.ishita.dao;

import org.hibernate.Query;

import com.ishita.pojo.Vehicle;

public class VehicleDAO extends DAO {

	public void saveVehicle(Vehicle vehicle) {

		try {
			begin();
			getSession().save(vehicle);
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			rollback();
			close();
		}
	}

	public Vehicle getVehicle(String vehicleNumber) {

		String hql = "from Vehicle as v where numberPlate=:numberPlate";
		Vehicle vehicle = null;
		try {
			begin();
			Query query = getSession().createQuery(hql);
			query.setParameter("numberPlate", vehicleNumber);
			vehicle = (Vehicle) query.uniqueResult();
			getSession().getTransaction().commit();
			close();
		} catch (Exception e) {
			// TODO: handle exception
			rollback();
			close();
		}
		return vehicle;
	}
}
