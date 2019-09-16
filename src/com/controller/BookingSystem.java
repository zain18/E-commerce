package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.CustomerAppointment;
import com.dao.BookingMgmt;

/**
 * Servlet implementation class BookingSystem
 */
@WebServlet("/BookingSystem")
public class BookingSystem extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5001522180895478011L;
	/**
	 * 
	 */
	
	private BookingMgmt bookingmgmt; 
	private CustomerAppointment custapt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingSystem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
	
		if ("TestDriveBooking".equals(page)) {
			String name = request.getParameter("name");
			String driversLicense = request.getParameter("dlnumber");
			String vehicleMake = request.getParameter("vmake");
			
		
			custapt = new CustomerAppointment(name, driversLicense, vehicleMake);
			
			bookingmgmt = new BookingMgmt();
			try {
				bookingmgmt.addCustomer(custapt);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			response.sendRedirect("pages/Confirmation.jsp");
		
	/*}else if("ViewBookings".equals(page)) {
		
		String appointmentDate = request.getParameter("TestDate");
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    
		try {
			java.sql.Date appointmentDateconverted = (java.sql.Date) sdf.parse(appointmentDate);
			bookingmgmt.ViewBookings(appointmentDateconverted);
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			RequestDispatcher reqDispatch = request.getRequestDispatcher("Error.jsp");
			reqDispatch.forward(request, response);
			e.printStackTrace();
		}
		
	*/	
	}else if("Confirmation".equals(page)) {
		RequestDispatcher reqDispatch = request.getRequestDispatcher("CancelBooking.jsp");
		reqDispatch.forward(request, response);
	}
		
		

	}
}
