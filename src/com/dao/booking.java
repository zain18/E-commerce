package com.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.beans.CustomerAppointment;

public interface booking {

	public int addCustomer(CustomerAppointment customer) throws Exception;
	public ArrayList<CustomerAppointment> ViewBookings(Date date) throws Exception;
	
}
