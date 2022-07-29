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
public class ProductDao {

	@Autowired
	SessionFactory sf;
	
	public String storeProduct(Product product) {
		try {
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(product);
			tran.commit();
			return "Product Stored";
		} catch (Exception e) {
			System.out.println(e);
			return e.getMessage();
		}
	}
	
	public List<Product> getAllProducts() {
		Session session = sf.openSession();
		Query qry = session.createQuery("select p from Product p");			// HQL 
		List<Product> listOfProduct = qry.list();
		return listOfProduct;
	}
	
	public int deleteProduct(int pid) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Product p = session.find(Product.class, pid);
		if(p==null) {
			return 0;
		}else {
			tran.begin();
				session.delete(p);
			tran.commit();
			return 1;
		}
	}
	
	public int updateProduct(Product product) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Product p = session.find(Product.class, product.getPid());
		if(p==null) {
			return 0;
		}else {
			tran.begin();
			p.setPrice(product.getPrice());
			session.update(p);        // 
			tran.commit();
			return 1;
		}
	}

	
}
