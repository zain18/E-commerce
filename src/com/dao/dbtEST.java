package com.dao;

import com.beans.CustomerAppointment;

public class dbtEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingMgmt mg = new BookingMgmt();
		CustomerAppointment cust = new CustomerAppointment();
		cust.setCustomerName("walid");
		cust.setDriverLicenseNo("ssfwe23");
		cust.setCarMake("BMW");
		try {
			mg.addCustomer(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
