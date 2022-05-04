package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDAO {
	
	@Autowired
	SessionFactory sf;
	
	public int storeProduct(Product pro) {
			try {
				Session session = sf.openSession();
				Transaction tran = session.getTransaction();
				tran.begin();
						session.save(pro);
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
	}
	public List<Product> getAllProduct(){
		Session session = sf.openSession();
		Query<Product> qry = session.createQuery("select p from Product p");
		List<Product> listOfPro = qry.list();
		return listOfPro;
	}
	

}
