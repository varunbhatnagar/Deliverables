<%/**
 * @author :rahul jain(team 1)
 *
 * @version 1.0
 *  all pages point  towards this page for LOGOUT as well as Session invalidating
 * 	
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
					<%session.invalidate(); %>
						<jsp:forward page="index.html" >
						<jsp:param name="mName" value="rahul" />
						</jsp:forward>
</body>
</html>