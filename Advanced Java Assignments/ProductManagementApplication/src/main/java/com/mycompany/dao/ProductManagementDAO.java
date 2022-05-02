package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.dbuti.DBUtil;
import com.mycompany.domain.Product;

public class ProductManagementDAO {
	
	public int storeEmployee(Product pro) {
		try {
			Connection con = DBUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, pro.getPid());
			pstmt.setString(2, pro.getPname());
			pstmt.setInt(3, pro.getPprice());
			int res= pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int deleteEmployee(int id) {
		try {
		Connection con = DBUtil.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
		pstmt.setInt(1, id);
		int res= pstmt.executeUpdate();
		return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int updateProduct(Product pro) {
		try {
			Connection con = DBUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("update product set pprice = ? where pid = ?");
			
			pstmt.setInt(1, pro.getPprice());
			pstmt.setInt(2, pro.getPid());
			int res= pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public List<Product> findAllEmployee() {
		
		List<Product> listOfEmp = new ArrayList<>();
		
		try {
			Connection con = DBUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Product pro = new Product();				// converting each record into java bean object. 
			pro.setPid(rs.getInt("pid"));
			pro.setPname(rs.getString("pname"));
			pro.setPprice(rs.getInt("pprice"));
			listOfEmp.add(pro);
		}
		return listOfEmp;
		
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
