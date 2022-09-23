package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String storeProdcut(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be >1000";
		}else if(pd.storeProduct(product)>0) {
			return "Product stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	
	public List<Product> getAllProduct() {
		List<Product> listOfProduct = pd.getAllProduct();
		Iterator<Product> li  = listOfProduct.iterator();
		while(li.hasNext()) {
			Product pp = li.next();
			float discountAmount = pp.getPrice()- pp.getPrice()*0.10f;
			pp.setPrice(discountAmount);
		}
		return listOfProduct;
	}
}
