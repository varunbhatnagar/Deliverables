<%/**
 * @author :praveen kumar(team 1)
 *
 * @version 1.0
 *  This JSP is generating data forOutlets at kolkata
 * 	
 * 
 **/%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java"  %>
<%@ page import="catchBean.Location" %>
<%@ page import="facade.Facade" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>BANGLORE OUTLETS</title>
</head>
<body bgcolor="#FFCC66">
<h3>OUTLETS IN KOLKATA<h3><br>
<%! Iterator locationItr;%>  <!-- Iterator to iterate through location list-->
   <% 	
   		Facade fc2=new Facade();
   		ArrayList locationlist=fc2.catchLocation("Kolkata");  //fetches all the outlets from Kolkata
   		locationItr=locationlist.iterator();
   		while(locationItr.hasNext()){
   			Location location =new Location();
   			location=(Location)locationItr.next();
   	%>
   	<%=location.getOutletName() %>  <br />
   	<%=location.getAddLine1() %>    <br />
   	<%=location.getAddLine2() %>    <br />
   	<%=location.getCity() %>        <br />
   	<%=location.getState() %>       <br />
   	<%=location.getPhoneNO() %>     <br />
   									<br />  <!-- To leave spaces between two outlet address -->
   		
  	<%  } %>  
   
</body>
</html>
