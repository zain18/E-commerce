package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.beans.CustomerAppointment;
import com.util.DBUtil;

public class BookingMgmt implements booking{

	@Override
	public int addCustomer(CustomerAppointment customer) throws Exception {
		Connection con = null;
		try {
			
		con  = DBUtil.getConnect();                                                                                             //(?, ?, ?, ?, to_date(?,'MM/DD/YYYY'))
			//STR_TO_DATE(?, '%m,%d,%Y')
		String query = "INSERT INTO TBL_Booking_1755638 (Customername, LicenseNo, VehicleMake) VALUES (?, ?, ?)";
			
		PreparedStatement pstmt = con.prepareStatement(query);
			
		pstmt.setString(1, customer.getCustomerName());
	    pstmt.setString(2, customer.getDriverLicenseNo());
		pstmt.setString(3, customer.getCarMake());
		
		pstmt.execute();
	
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 1;
		
	}

	@Override
	public ArrayList<CustomerAppointment> ViewBookings(Date date) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

	/*
	public ArrayList<CustomerAppointment> ViewBookings(Date date) throws Exception {
		Connection con = null;
		try {
			
		con  = DBUtil.getConnect();
			
		String query = "SELECT * FROM TBL_Booking_1755638 WHERE ProposedDate = ?";
			
		PreparedStatement pstmt = con.prepareStatement(query);
			
		pstmt.setDate(1, date);
			
		ResultSet result = pstmt.executeQuery();
		ArrayList<CustomerAppointment> ViewAppointments = new ArrayList<>();
		CustomerAppointment custappointment = new CustomerAppointment();
		/* here assume i have multiple rows in the result set */
		/*while(result.next()) {
			custappointment.setCustomerName(result.getString("Customername"));
			custappointment.setDriverLicenseNo(result.getString("LicenseNo"));
			custappointment.setAppointment(result.getDate("ProposedDate"));
			ViewAppointments.add(custappointment);
			custappointment.setBookings(ViewAppointments);
		}
	
		} catch (SQLException e) {

			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return null;
	}*/

}
