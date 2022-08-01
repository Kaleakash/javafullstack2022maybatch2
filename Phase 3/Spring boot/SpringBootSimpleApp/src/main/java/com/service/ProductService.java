package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepositoy;
	public List<Product> findAllProducts() {
		return productRepositoy.findAll();		// findAll return list of entities 
	}
	
	public String storeProduct(Product product) {
		Optional<Product> result	= productRepositoy.findById(product.getPid());
		if(result.isPresent()) {
			return "Product id must be unique";
		}else {
			productRepositoy.save(product);
			return "Product record stored successfully";
		}
	}
	
	public String updateProduct(Product product) {
		Optional<Product> result	= productRepositoy.findById(product.getPid());
		if(result.isPresent()) {
			Product p = result.get();
			p.setPrice(product.getPrice());
			productRepositoy.saveAndFlush(p);
			return "Product Details updated successfully";
		}else {
			return "Product not present";
		}
	}
	public String deleteProduct(int pid) {
		Optional<Product> result	= productRepositoy.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			productRepositoy.delete(p);
			return "Product Details deleted successfully";
		}else {
			return "Product not present";
		}
	}
}
