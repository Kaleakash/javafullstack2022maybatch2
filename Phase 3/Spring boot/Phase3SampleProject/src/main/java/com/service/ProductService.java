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
	ProductRepository productRepository;
	
	
	public String storeProdcut(Product product) {
		productRepository.save(product);
		return "Product stored successfully";
	}
	
	public String updateProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p = result.get();
			p.setPrice(product.getPrice());
			p.setQuantity(product.getQuantity());
			p.setUrl(product.getUrl());
			productRepository.saveAndFlush(p);
			return "Produt Details updated successfully";
		}else {
			return "Product didn't update";
		}
	}
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public List<Product> findProductByCategory(String category){
		return productRepository.findProductByCategory(category);
	}
	
	
}
