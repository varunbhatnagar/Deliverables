<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--Imports for standard API's-->
<%@ page import="java.sql.Connection" %> 
<%@ page import="java.sql.PreparedStatement" %> 
<%@ page import="java.sql.ResultSet" %> 
<!--Imports for DB Connection class--> 
<%@page import="dataBase.CreateConnection"%>


<!--Java Scripts for OutletMangerHomePage.jsp-->
<script type="text/javascript">
	/**
	* Gets the selected city and submits the form to OutletManagerGetOutlet.jsp
	* @param
	* @return
	**/
	var selectedCity;
	function getSelectedCity(){
		var list=document.getElementById("LocCityList");
		var selected=list.options[list.selectedIndex].text;
		document.getElementById("managerHomeForm").submit();
	}
</script>
<!--End  of Java Scripts for OutletMangerHomePage.jsp-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Outlet Manager</title>
<script type="text/javascript" src="spinmenu.js"></script>
</head>
<body background="images/bg_main01.jpg">
<form name="managerHomeForm" action="OutletManagerGetOutlet.jsp" method="post" >
<script type="text/javascript">
	rahul.isVertical =0;                   // if it's vertical or horizontal [0|1]
	rahul.x = 500;                         // x offset from point of insertion on page
	rahul.y = 200;                         // y offset from point of insertion on page
	rahul.w = 150;                         // item's width
	rahul.h = 30;                          // height
	rahul.r = 150;                         // menu's radius
	rahul.v = 20;                          // velocity
	rahul.s = 8;                           // scale in space (for 3D effect)
	rahul.color = '#FFFFFF';               // normal text color
	rahul.colorover = '#ffffff';           // mouseover text color
	rahul.backgroundcolor = '#DC143C';     // normal background color	
	rahul.backgroundcolorover = '#EE6363'; // mouseover background color
	rahul.bordercolor = '#000000';         // border color
	rahul.fontsize = 15;                   // font size
	rahul.fontfamily = 'Arial';            // font family
	if (document.getElementById) {
		document.write('<div id="orderanchor" style="height:'+eval(rahul.h+20)+'"></div>')
		rahul.anchor=document.getElementById('orderanchor')
		rahul.ordermenu();
		rahul.x+=getposOffset(rahul.anchor, "left") //relatively position it
		rahul.y+=getposOffset(rahul.anchor, "top")  //relatively position it
		// menuitem:   rahul.ordermenuitem(text, link, target)
		rahul.ordermenuitem("HOME","HomeForAdmin.jsp");
			rahul.ordermenuitem("MENU","Menu.jsp");
			rahul.ordermenuitem("LOGOUT","LogOut.jsp");
			rahul.ordermenuitem("LOCATION","Location.html");
			rahul.ordermenuclose();
	}
</script>
<table width="853" height="1126" border="1" align="center"  bordercolor="#003333" >
	<tr>
    	<td width="843" height="163"><img src="images/welcome.jpg" width="843" height="159" /></td>
  	</tr>
  	<tr>
  		<td height="82"  ></td>
  	</tr>
  	<tr>
  	<tr>
  	</tr>
  	<tr>
    	<td height="869">
			<table width="842" height="856" border="1"  bordercolor="#003333" >
      			<tr>
        			<td width="419" height="850" bgcolor="#FFCC99">
        			<!--Establishes connection using the DB connection class with the database-->
	<% 	try{ 
		CreateConnection connclassObject = new CreateConnection();
		Connection connect = connclassObject.returnCon();%>
		<%--SQL Query to get city available from the database --%>
		<%String locGetCityQuery = " select DISTINCT CITY from Location"; 
		PreparedStatement preparedStatement = connect.prepareStatement(locGetCityQuery);
		ResultSet resultSet = preparedStatement.executeQuery();%>
		<%out.print("Select Store City");%>
		<!--Drop down list box to display the city available -->
		<select name="LocCityList" size="1" onchange="getSelectedCity();">
			<option value="default"> -Select City-</option>
		<!--Populates the drop down list box with city available from the result set-->
		<%while(resultSet.next()){ 
  			String locCity = resultSet.getString("city"); %>
  			<option value=<%=locCity%> ><%=locCity%></option>
		<%} %> 
		</select>
		<jsp:include page="OutletManagerGetOutlet.jsp"></jsp:include>
		<!--Closes the connection if available-->
		<%if (connect != null) 
  			connect.close(); %>
	<%}
	catch(Exception e){ %>
	<!--Prints the stack trace of the exception occurred-->
	<%	out.println(e);
	} 
%> 
	</form>&nbsp;</td>
      			</tr>
    		</table>
		</td>
  	</tr>
</table>
</body>
</html>
