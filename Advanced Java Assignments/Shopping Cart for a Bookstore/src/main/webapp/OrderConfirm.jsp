<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.dao.*"%>
<%@page import="com.db.*"%>
<%@page import="com.entity.*"%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Confirmed</title>
    </head>
        <body bgcolor="yellow">
    
     <%
    
    	Users user=(Users)session.getAttribute("currentUser");
    	if(user==null){
    	response.sendRedirect("Login.jsp");
    	}

    
    %>
    
    <%
    
	int quantity=Integer.parseInt(request.getParameter("q"));
	String address=request.getParameter("address");
	String name=request.getParameter("cname");
	String mobileno=request.getParameter("no");
	UserDao dao= new UserDao(Jdbcconnection.getConnection());
	Orders o = new Orders(address,mobileno,name,quantity);
	dao.orderConfirm(o);

%>
    
    
     <style>
      #logout {
     
     color: red;
     padding-right: 20px;
     font-size: 30px
    }
    </style>
    
     <div align="right"> 
        <a id="logout" href="LogoutServlet">Logout</a>
	</div>
    
            <center>
                <h1> SHOPPING CART FOR BOOK STORE </h1> 
                <h2> Your order has been confirmed. The Books Shall be delivered within 2 days.</h2>
               <h3>Thank You for online book shopping .</h3> 
                <a href="Welcome.jsp">click here to go to main page</a>
            </center>
    </body>
</html>>