package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String storeProdutInDb(Product product) {
		System.out.println("i came to service layer");
		if(product.getPrice()<500) {					// business logic 
			return "Product price must be >500";
		}
		else if(pd.storeProduct(product)>0) {
			return "Product Stored successfully";
		}else {
			return "Product details didn't store";
		}
	}
	
	public List<Product> getAllProductFromDb() {
		return pd.findAllProduct();
	}
	
	public String checkUser(String name, String password) {
		if(name.equals("raj") && password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
	public float updateProductPrice(Product product) {
		if(product.getPname().equals("TV")) {
			return product.getPrice()+5000;
		}else if(product.getPname().equals("Computer")) {
			return product.getPrice()+3000;
		}else {
			return product.getPrice()+500;
		}
	}
	public Product getProductInfo() {
		Product p = new Product();
		p.setPid(1);
		p.setPname("Laptop");
		p.setPrice(85000);
		//return null;
		return p;
	}
	public List<Product> getAllProduct() {
		List<Product> listOfProduct = new ArrayList<Product>();
		Product p1 = new Product(1, "TV", 45000);
		Product p2 = new Product(2, "Computer", 35000);
		Product p3 = new Product(3, "Laptop", 55000);
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(p3);
		return listOfProduct;
	}
	
	
}
