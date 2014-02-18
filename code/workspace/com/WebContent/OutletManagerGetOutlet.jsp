<%/**
 * @author LAKHAA.J
 *
 * @version 1.0
 * This OutletManagerGetOutlet class contains contains the Pizza outlets available that is
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
<!--Java Scripts for OutletMangerGetOutlet.jsp-->
<script type="text/javascript">
	/**
	* Gets the selected outlet and submits the form to OutletManagerTransactionDetail.jsp
	* @param
	* @return
	**/
	function getTransDetails(){
		var list=document.getElementById("LocOutletList");
		var selected=list.options[list.selectedIndex].text;
		document.getElementById("managerOutletsForm").submit();
	}
</script>
<!--End of Java Scripts for OutletMangerGetOutlet.jsp-->
<body bgcolor="#FFCC99"> 
	<form name="managerOutletsForm" action="OutletManagerTransactionDetail.jsp" method="post" >
	<!--Saves the selected city edited by the user in  a request object-->
	<%String selectedCity = request.getParameter("LocCityList");%>
	<!--Establishes connection using the DB connection class with the database-->
	<%try{		
		CreateConnection connclassObject = new CreateConnection();
		Connection connect = connclassObject.returnCon();%>
		<%--SQL Query to get outlets available in a city from the database --%>
		<%String locGetOutletyQuery = " select OUTLET_NAME FROM Location where city=?"; 
		PreparedStatement preparedStatement = connect.prepareStatement(locGetOutletyQuery);
		if(selectedCity!=null){
		preparedStatement.setString(1,selectedCity.toString());
		ResultSet resultSet = preparedStatement.executeQuery();
		out.print("Select Oulet Store");%>
		<!--Drop down list box to display the outlets available in the selected city-->
		<select name="LocOutletList" size="1" onchange="getTransDetails()">
			<option value="default"> -Select Outlet-</option>
			<!--Populates the drop down list box with outlets available in the selected city from the result set-->
			<%while(resultSet.next()){
				int cnt = resultSet.getRow();
  				String locOutlet = resultSet.getString(1); %>
			  	<option value=<%=locOutlet%> ><%=locOutlet%></option>
			<%} }%> 
		</select>
		<!--Closes the connection if available-->
		<%if (connect != null) 
  			connect.close(); %>
	<%}	catch(Exception e){ %>
		<!--Prints the stack trace of the exception occurred-->
	<%	e.printStackTrace(); 
	}%> 
	</form>
</body> 
</html> 