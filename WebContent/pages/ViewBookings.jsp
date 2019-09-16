<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<input type="hidden" id="page" name="page" value="ViewBookings" >
  <div id="page" class="center">
    <div id="main">
      <div id="content">
        <div id="form">
          <h2>Test Drive Booking System</h2>
           <form name="View-Booking" action="<%=request.getContextPath()%>/BookingSystem" method="post">
              <input type="hidden" id="page" name="page" value="ViewBookings">
              <label for="TestDate">Test Drive Date</label><br>
              <input type= "text" class="datepicker" name = "TestDate"/><br><br>
              <input type="submit" name="submit" value="View Bookings"/>   
          </form>
        </div>
      </div>
    </div>
  </div>
</body>
</html>