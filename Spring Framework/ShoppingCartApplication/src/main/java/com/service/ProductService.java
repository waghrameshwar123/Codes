package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDAO;

@Service
public class ProductService {
	@Autowired
	ProductDAO productDao;
	
	public List<Product> getAlProducts() {
		return productDao.getAllProduct();
	}
	
	public String storeProduct(Product pro) {
		if(productDao.storeProduct(pro)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String updateProduct(Product pro) {
		if(productDao.updateProduct(pro)>0) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String deleteProduct(int id) {
		if(productDao.deleteProduct(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
}
