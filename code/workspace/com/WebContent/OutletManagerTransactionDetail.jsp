<%/**
 * @author 
 *
 * @version 1.0
 * This OutletManagerTranactionDetail class contains the Transaction details
 * dnamically generated from the JDBC Conncection
 * 
 **/%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--Imports for standard API's-->
<%@page import="java.sql.ResultSet"%>

<!--Imports for Facade and Bean class-->
<%@page import="facade.Facade"%>
<%@page import="catchBean.TransactionStatusBean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<!--Java Scripts for OutletMangerTransactionDetail.jsp-->
<script>
	/**
	* Checks if the transaction id is selected and forwards the page to OutletManagerReportGenerate.jsp
	* @param
	* @return
	**/
	function gotoGenerate(){
		var table = document.getElementById('transTable');  
		var totrowCount = table.rows.length;
		var flag;  
		for(var rowcnt=1; rowcnt<totrowCount;  rowcnt++) {   
			var row = table.rows[ rowcnt];   
			var chkbox = row.cells[0].childNodes[0];  
			if (null != chkbox && true == chkbox.checked){
				flag=1;				
			}
		}
		if(flag==1){
			document.transactionDetail.action="OutletManagerReportGenerate.jsp";
		}
		else{
			alert("not checked");
		}
	}
	/**
	* Checks if the tranaction id is selected and enables the transaction status to be edited
	* @param
	* @return
	**/
	function editTransId(){
		var table = document.getElementById('transTable');  
		var totrowCount = table.rows.length;  
		for(var rowcnt=1; rowcnt<totrowCount;  rowcnt++) {   
			var row = table.rows[ rowcnt];   
			var chkbox = row.cells[0].childNodes[0];  
			if (null != chkbox && true == chkbox.checked){
			
				table.rows[rowcnt].cells[3].childNodes[0].disabled=false;
			}
			else{
				table.rows[rowcnt].cells[3].childNodes[0].disabled=true;
				
			}
		}
	}
	/**
	* Checks if the tranaction id is selected and forwards the page OutletManagerEdit.jsp for saving 
	* the status edited by the user
	* @param
	* @return
	**/
	function saveTransId(){
		var check_choice = false;
		var flag;
		for(cnt=0;cnt<transactionDetail.TransOptionRadio.length;cnt++){
			if (transactionDetail.TransOptionRadio[cnt].checked){
				check_choice = true; 
				
			}
		}
		if(!check_choice){
			alert("Please select a transaction");
		}
		else{
		var table = document.getElementById('transTable');  
		var totrowCount = table.rows.length;  
		for(var rowcnt=1; rowcnt<totrowCount;  rowcnt++) {   
			var row = table.rows[ rowcnt];   
			var chkbox = row.cells[0].childNodes[0];  
			if (null != chkbox && true == chkbox.checked){
				table.rows[rowcnt].cells[3].childNodes[0].disabled=true;
				transactionDetail.TransStatusSet.value = table.rows[rowcnt].cells[3].childNodes[0].value;
				flag=1;
			}
		}
		}	
		if(flag==1){
		document.transactionDetail.action="OutletManagerEdit.jsp";
		}
}	
</script>
<!--End of Java Scripts for OutletMangerTransactionDetail.jsp-->
<body  bgcolor="#FFCC99" onload="editTransId();">
	<form name="transactionDetail" action="" method="post">
	<!-- Gets the selected outlet name from request object-->
	<%String selectedOutlet = request.getParameter("LocOutletList");%>
	<%if(selectedOutlet!=null){ 
	session.setAttribute("sessionSelectedOutlet",selectedOutlet); 
	}%>
	
	<!-- Creates new facade object -->
	<%!Facade facadeObject = new Facade(); %>
	
	<!-- Creates new Transaction Status Bean object and uses the setter method to set outlet name -->
	<%!TransactionStatusBean transStatusObject = new TransactionStatusBean(); %>
	<%transStatusObject.setTransOutletName(selectedOutlet);%>
		
	<!-- Facade class method is called by passing bean object that returns the result set -->
	<%ResultSet resultset = facadeObject.catchTransactionStatus(transStatusObject); %>
	
	<!-- Button to that calls gotoGenerate() function and forward to OutletManagerReportGenerate.jsp -->
	<input type="submit" name="TransButton" value="GenerateReport" onClick="gotoGenerate();">
	<!-- Button to forward hat calls saveTransId() function  -->
	<input type="submit" name="TransButton" value="SaveTransactionStaus" onClick="saveTransId();">
	<!-- Hidden field that saves the transaction status that is edited by the user  -->
	<input type="hidden" name="TransStatusSet" value="" >
	
	<!-- Div tag for the Transaction table -->
	<div style="overflow:auto; height:450px;width:820px;" id="tableDiv">
	
	<!-- Table to display the transaction Header details  -->
	<table id="transTable" width="576" border="1">
	<tr>
		<th width="46">Select</th>
		<th width="150">TransactionId</th>
		<th width="202">TransactionDateTime</th>
		<th width="150">Status</th>
	</tr>
	
	<!-- Table to display the transaction details  -->
	<%try{ %>
		<%
		while(resultset.next()){
		int cnt=0;
		%>
		<tr>
			<!-- Table Cell to display the radio button to select the transaction id -->
			<td width="46" id="transselectCell" align="center" ><input type="radio" name="TransOptionRadio"
			value=<%=resultset.getString(1)%> onclick="editTransId();"></td>
			
			<!-- Table Cell to display the text field to select the transaction id -->
			<td width="150" id="transidCell" align="center"><input type="text" name="TransIdText" 
			value=<%=resultset.getString(1)%> readonly="readonly"></td>
			
			<!-- Table Cell to display the text field to select the transaction date time -->
			<td width="202" id="transdateCell" align="center"><input type="text" name="TransDateText" 
			value=<%=resultset.getString(2)%> readonly="readonly"></td>
			
			<!-- Table Cell to display the drop down list to select the transaction status based on the existing status -->
			<%if( resultset.getString(3).equalsIgnoreCase("Pending")){%>
				<td width="150" id="transstatusCell" align="center" >
				<select name="TransStatusList<%=cnt%>" size="1" disabled="disabled"%>
					<option value="Pending" selected="selected"><%=resultset.getString(3)%></option>
					<option value="Delivered">Delivered</option>
					<option value="Canceled">Canceled</option>
				</select>
				</td>
			<%}%>
			<%if( resultset.getString(3).equalsIgnoreCase("Delivered")) {%>
				<td width="150" id="transstatusCell" align="center" >
				<select name="TransStatusList<%=cnt%>" size="1" disabled="disabled">
					<option value="Delivered" selected="selected" ><%=resultset.getString(3)%></option>
					<option value="Pending">Pending</option>
					<option value="Canceled">Canceled</option>
				</select>
			</td>
			<%} %>
			<%if( resultset.getString(3).equalsIgnoreCase("Canceled")){%>
				<td width="150" id="transstatusCell" align="center"  >
				<select name="TransStatusList<%=cnt%>" size="1" disabled="disabled">
					<option value="Canceled" selected="selected"><%=resultset.getString(3)%></option>
					<option value="Pending" >Pending</option>
					<option value="Delivered">Delivered</option>
			</select>
			</td>
			<%} %>
		</tr>
		<!-- Increments the counter for the List box -->
		<% cnt++;	
		} 
	}//end of try block
	catch(Exception e){
	}%>
	</table>
	</div>
</form>
</body>
</html>
