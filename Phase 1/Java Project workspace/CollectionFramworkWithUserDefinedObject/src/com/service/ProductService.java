package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Product;

public class ProductService {
	List<Product> listOfProduct = new ArrayList<Product>();
	
	public String addProduct(Product product) {
		if(listOfProduct.add(product)) {
			return "Product added successfully";
		}else {
			return "Product didn't add";
		}
	}
	
	public List<Product> getAllProduct() {
		return listOfProduct;
	}
}
