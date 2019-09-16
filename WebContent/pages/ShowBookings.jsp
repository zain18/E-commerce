<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.beans.CustomerAppointment"%> 
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body {
    background-color: #93B874;
}
h1 {
    background-color: #00b33c;
}
p {
    background-color: #FFFFFF);
}
</style>
<body>

<%
  CustomerAppointment custbookings = new CustomerAppointment();
  ArrayList bookings = custbookings.getBookings();
  Iterator it = bookings.iterator();
  while ( it.hasNext() ) {
	custbookings = (CustomerAppointment)it.next();
    out.println(custbookings.getCustomerName());
    out.println(custbookings.getCarMake());
    out.println(custbookings.getDriverLicenseNo());
    out.println(custbookings.getAppointment());
  }
%>

</body>
</html>