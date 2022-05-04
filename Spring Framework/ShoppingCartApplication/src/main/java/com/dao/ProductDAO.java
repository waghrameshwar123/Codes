package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDAO {
	
	@Autowired
	EntityManagerFactory emf;
	
	public List<Product> getAllProduct() {
		EntityManager manager  = emf.createEntityManager();
		Query qry = manager.createQuery("select pro from Product pro");
		List<Product> listOfPro = qry.getResultList();
		return listOfPro;
	}
	
	public int storeProduct(Product pro) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(pro);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	}
	public int updateProduct(Product pro) {
		
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			Product p = manager.find(Product.class, pro.getId());
			if(p==null) {
				return 0;
			}else {
				tran.begin();
				p.setPrice(pro.getPrice());
				manager.merge(p);				// update the record. 
				tran.commit();
				return 1;
			}
	}
	public int deleteProduct(int id) {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Product p = manager.find(Product.class, id);
		if(p==null) {
			return 0;
		}else {
			tran.begin();
			manager.remove(p);
			tran.commit();
			return 1;
		}
}
	

}
