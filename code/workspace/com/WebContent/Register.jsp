<%/**
 * @author :Praveen(team 1)
 *
 * @version 1.0
 *  this JSP is taking data from registration.html and forwarding to the database
 * 	
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="catchBean.Customer" 
     pageEncoding="ISO-8859-1"%>
    <%@page import="facade.Facade"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register JSP</title>
</head>
<body>
<%! int status;
	int statusOfReg;%>
   <% 	String userId=request.getParameter("userid");
   		String password=request.getParameter("password");
   		String confirmPassword=request.getParameter("confirmPassword");
   		String userType=request.getParameter("usertype");
   		String name=request.getParameter("name");
   		String phoneNo=request.getParameter("phoneno");
   		String addLine1=request.getParameter("addressline1");
   		String addLine2=request.getParameter("addressline2");
   		String city=request.getParameter("city");
   		String pincode=request.getParameter("pincode");
   		String state=request.getParameter("states");
   		
   			Customer registerCustomer= new Customer();
  
   			registerCustomer.setUserId(userId);
   			registerCustomer.setPassword(password);
   			registerCustomer.setType(userType);
   			registerCustomer.setName(name);
   			registerCustomer.setPhNo(phoneNo);
   			registerCustomer.setAddLine1(addLine1);
   			registerCustomer.setAddLine2(addLine2);
   			registerCustomer.setCity(city);
   			registerCustomer.setPinCode(pincode);
   			registerCustomer.setState(state);
   			Facade fc1=new Facade();
   			status=fc1.catchCustomer(registerCustomer);	
   			
   		if(status==1){%>
   		<jsp:forward page="HomeAfterLogin.jsp" >
   		<jsp:param name="Name" value="rahul" />
   		</jsp:forward>
		<% }
		else {%>
			<script>alert("Registration failed!!! user id is already in use,Register again");</script>
		<%   } %> 
</body>
</html>