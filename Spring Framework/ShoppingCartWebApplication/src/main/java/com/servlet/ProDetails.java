package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProDetails
 */
@WebServlet("/ProDetails")
public class ProDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();  
        response.setContentType("text/html");  
        pw.println("<html><body><div align=\"center\">"); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//	        System.pw.println("Driver loaded successfully");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","admin");
//	        System.pw.println("Database connected...");
			
	        Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from product");
			pw.println("<h1>Product List</h1><br><br>");
			pw.println("<table border=1 width=10% height=10%>");  
            pw.println("<tr><th>Id</th><th>Name</th><th>Price</th><th>Quantity</th><tr>");  
            while (rs.next()) 
            {  
                int n = rs.getInt("id");  
                String nm = rs.getString("name");
                float nmn = rs.getFloat("price");
                int  nmm = rs.getInt("quantity");
                pw.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + nmn + "</td><td>" + nmm + "</td></tr>");   
            }  
            pw.println("</table>");  
            pw.println("</div></body></html>");  
            con.close();  
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
