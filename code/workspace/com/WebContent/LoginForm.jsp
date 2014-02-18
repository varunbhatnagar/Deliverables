<%/**
 * @author :Praveen Kumar(team 1)
 *
 * @version 1.0
 *  This JSP is taking data from Login.html when user logs in
 * 	handles all kind of user,
 * set some of session variables as well as max inactive time interval
 **/%>
<%@ page language ="java" import="facade.Facade" import="java.util.StringTokenizer" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
 

<%

String password=request.getParameter("password");


	%>
	 	<jsp:useBean id="objLoginBean" class="catchBean.LoginBean" scope="session" /> 
		<jsp:setProperty name="objLoginBean" property="userName" param="login_id" /> 
		<jsp:setProperty name="objLoginBean" property="password" param="password" />
		<jsp:setProperty name="objLoginBean" property="type" param="usertype" />  
	<% 
		
	   Facade fc=new Facade();
	   String status=fc.catchLogin(objLoginBean); 
	   System.out.println(status);
	   StringTokenizer st=new StringTokenizer(status,",");
	   String returnStatus=st.nextToken();
	   
	   System.out.println(returnStatus);
	   if(returnStatus.equals("1")||returnStatus.equals("4")) {
		   application.setAttribute("error","Invalid userId!!! User Id doesnot exists");%>
		   <jsp:forward page="Response.html" />
	  <%  }
	    if (returnStatus.equals("2")||returnStatus.equals("5")) {
		   application.setAttribute("error1","Invalid Password");
	   }
	   if(returnStatus.equals("3")){
		   		String typeOfUser=request.getParameter("usertype");
		   		String noOfTrans=st.nextToken();
	   			int noOfTrans1=Integer.parseInt(noOfTrans);
		   		String custId=st.nextToken();
		   		System.out.println(custId);
		   		String loginid=request.getParameter("login_id");
		   		
		   		 
		   		session.setMaxInactiveInterval(240);
		   		session.setAttribute( "noOfTransaction",noOfTrans);
		   		session.setAttribute( "customerId",custId); 
		   		session.setAttribute( "type",typeOfUser); 
		   		session.setAttribute( "loginId",loginid);%>
	     <jsp:forward page="HomeAfterLogin.jsp" />
			 <%   
			   }%>
	 <%  if(returnStatus.equals("6")){%>	
	 
	 <jsp:forward page="HomeForOutletmanager.jsp" />
	  <%   
			   }%>
			   <%   if(returnStatus.equals("7")){%>	
	 
	 <jsp:forward page="HomeForAdmin.jsp" />
	  <%   
			   }%>

