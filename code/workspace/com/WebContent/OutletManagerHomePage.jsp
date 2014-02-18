<%/**
 * @author LAKHAA.J
 *
 * @version 1.0
 * This OutletManagerHomePage class contains contains the city list available that is
 * dnamically generated from the JDBC Conncection
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 
<!--Imports for standard API's-->
<%@ page import="java.sql.Connection" %> 
<%@ page import="java.sql.PreparedStatement" %> 
<%@ page import="java.sql.ResultSet" %> 

<!--Imports for DB Connection class--> 
<%@page import="dataBase.CreateConnection"%>
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Insert title here</title>  
</head> 
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
<body> 
	<form name="managerHomeForm" action="OutletManagerGetOutlet.jsp" method="post" >
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
	</form>
</body> 
</html> 