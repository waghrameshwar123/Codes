package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.Jdbcconnection;
import com.entity.Users;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String useruname=request.getParameter("uname");
		String userpassword=request.getParameter("pass");
		
		UserDao dao= new UserDao(Jdbcconnection.getConnection());
		
		Users u=dao.getUserByUnameAndPassword(useruname, userpassword);
		
		if(u==null) {
			
			out.println("Invalid Details!!.. Try again");
			
			HttpSession s=request.getSession();
			
			response.sendRedirect("Login.jsp");
			
			
		}
		else {
			// login success
			
			HttpSession s=request.getSession();
			s.setAttribute("currentUser", u);
			response.sendRedirect("Welcome.jsp");
			
		}
	}

}
