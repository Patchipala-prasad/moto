<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adimin Personal</title>
<link rel="stylesheet" type="text/css" href="/PaymentBilling/resources/Css/stylesheet.css">
</head>
<body>
	<div class="top"><h1>PAYMENT BILLING SYSTEM </h1></div>
    <div id="back"></div>
    <div class="container">
        <div class="child">HOME</div>
        <div class="child">NEW REGISTRATION</div>
        <div class="child">MODIFY DETAILS</div>
        <div  class="child"> ADIMISTRATIOR</div>
        <div class="child">CONTACT US</div>
        
    </div>
    <%String message=(String)request.getAttribute("mes");
    if(message!=null)
    {%>
    <center><h4 style="color:red"><%=message %></h4></center>
    <% } %>
    <h1>Login Form</h1>
    <form action="performAdminstration">
    <div class="grid">
            <div class="grid_item"><label for="userName">User Name</label></div>
            <div class="grid_item"><input type="text" name="userName"></div>
            <div class="grid_item"><label for="password">Password</label></div>
            <div class="grid_item"><input type="text" name="password" id=""></div>
            <div class="grid_item" id="sub"><input type="submit" value="Login" id="submit"></div>
    
    </div>
    </form>
</body>
</html>