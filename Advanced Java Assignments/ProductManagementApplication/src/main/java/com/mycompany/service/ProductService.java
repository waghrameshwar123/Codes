package com.mycompany.service;

import java.util.Iterator;
import java.util.List;

import com.mycompany.dao.ProductManagementDAO;
import com.mycompany.domain.Product;

public class ProductService {
	
public String storeProduct(Product pro) {
		
		if(pro.getPprice()<1000) {
			return "Price must be > 1000";
		}else {
			ProductManagementDAO pd = new ProductManagementDAO();
			int res = pd.storeEmployee(pro);
			if(res > 0) {
				return "Record inserted";
			}else {
				return "Record didn't insert";
			}
			
		}
	}
	public String deleteProductInfo(int pid) {
		ProductManagementDAO pd = new ProductManagementDAO();
		if(pd.deleteEmployee(pid)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	public String updateProductInfo(Product pro) {
		ProductManagementDAO ed = new ProductManagementDAO();
		if(ed.updateProduct(pro)>0) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	public List<Product> getAllProduct() {
		ProductManagementDAO ed = new ProductManagementDAO();
		List<Product> listOfPro = ed.findAllEmployee();
		Iterator<Product> li = listOfPro.iterator();
		while(li.hasNext()) {
			Product pro = li.next();
			pro.setPprice(pro.getPprice()+1000);
		}
		return listOfPro;
	}

}
