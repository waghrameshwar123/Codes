package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.Books;
import com.entity.Orders;
import com.entity.Users;

public class UserDao {
	private Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}
//	method to insert in database
	public boolean saveUser(Users user) {
		boolean f=false;

		try {
			String query="insert into users(first_name,address,email,user_name,password)values (?,?,?,?,?)";
			PreparedStatement pstmt	=this.con.prepareStatement(query);
			pstmt.setString(1,user.getFirst_name());
			pstmt.setString(2,user.getAddress());
			pstmt.setString(3,user.getEmail());
			pstmt.setString(4,user.getUser_name());
			pstmt.setString(5,user.getPassword());
			
			pstmt.executeUpdate();
			f=true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}
	public Users getUserByUnameAndPassword(String uname, String password) {
		Users user=null;
		try {
			String query="select * from users where user_name=? and password=?";
			
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, uname);
			psmt.setString(2, password);
			
			ResultSet set=psmt.executeQuery();
			
			if(set.next()) {
				user=new Users();
				//data from db
				user.setFirst_name(set.getString("first_name"));
				//set to user object
				user.setEmail(set.getString("address"));
				user.setEmail(set.getString("email"));
				user.setUser_name(uname);
				user.setPassword(set.getString("password"));
				user.setRegistration_date(set.getTimestamp("registration_date"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public Users resetPassword(String email, String uname) {
		Users user=null;
		try {
			String query="select * from users where email=? and user_name=?";
			
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, email);
			psmt.setString(2, uname);
			
			ResultSet set=psmt.executeQuery();
			
			if(set.next()) {
				user =new Users();
				//data from db
				//set to user object
				user.setEmail(set.getString("address"));
				user.setEmail(set.getString("email"));
				user.setUser_name(uname);
				user.setPassword(set.getString("password"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	public int setPassword(String pass) throws SQLException {
		
		
		String query="update users set password=? where user_name=?";
		Users user=new Users();
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setString(1, pass);
		psmt.setString(2,(user.getUser_name()));
		return psmt.executeUpdate();
	}
	
public Books getBookDetailsById(String Book_id) throws SQLException {
		
		Books book=null;
		
		String query="Select * from books where book_id=?";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setString(1,Book_id);
		ResultSet rs=psmt.executeQuery();
		while(rs.next()){
			book=new Books();
			book.setBook_id(rs.getString(1));
			book.setBook_name(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPrice(rs.getDouble(4));
			
		}
		
		return book;
		
	}
	public boolean orderConfirm(Orders order) {
		boolean f=false;

		try {
			String query="insert into order_details(address,phone_no,cust_name,Quantity)values (?,?,?,?)";
			PreparedStatement pstmt	=this.con.prepareStatement(query);
			pstmt.setString(1,order.getAddress());
			pstmt.setString(2,order.getMobileno());
			pstmt.setString(3,order.getName());
			pstmt.setInt(4,order.getQuantity());
			
			pstmt.executeUpdate();
			f=true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

}
