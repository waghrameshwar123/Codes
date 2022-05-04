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
	
	public String storeProduct(Product pro) {
		if(pro.getPrice()<1000) {
			return "Price > 100";
		}else {
			if(productDao.storeProduct(pro)>0) {
				return "Record inserted successfully";
			}else {
				return "Record didn't insert";
			}
		}
	}
	
	public List<Product> getProduct() {
		ProductDAO pd = new ProductDAO();
		return pd.getAllProduct();
}
}
