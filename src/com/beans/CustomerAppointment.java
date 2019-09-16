package com.beans;

import java.sql.Date;
import java.util.ArrayList;

public class CustomerAppointment {
 private String CustomerName;
 private String DriverLicenseNo;
 private String CarMake;
 private String appointment;
 private ArrayList< CustomerAppointment> bookings;
 
 


public ArrayList<CustomerAppointment> getBookings() {
	return bookings;
}
public void setBookings(ArrayList<CustomerAppointment> bookings) {
	this.bookings = bookings;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getDriverLicenseNo() {
	return DriverLicenseNo;
}
public void setDriverLicenseNo(String driverLicenseNo) {
	DriverLicenseNo = driverLicenseNo;
}
public String getCarMake() {
	return CarMake;
}
public void setCarMake(String carMake) {
	CarMake = carMake;
}


public String getAppointment() {
	return appointment;
}
public void setAppointment(String appointment) {
	this.appointment = appointment;
}
public CustomerAppointment(String customerName, String driverLicenseNo, String carMake) {
	super();
	CustomerName = customerName;
	DriverLicenseNo = driverLicenseNo;
	CarMake = carMake;
	
}
public CustomerAppointment() {
	
}
 
}
