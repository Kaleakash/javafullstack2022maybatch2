package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bean.Product;

class ProductServiceTest {

	@Test
	@DisplayName(value = "Check User Details")
	//@Disabled
	void testCheckUser() {
		//fail("Not yet implemented");
		ProductService ps = new ProductService();
		String result1 = ps.checkUser("raj", "123");
		String result2 = ps.checkUser("ajay", "567");
		assertEquals("success", result1);
		assertEquals("failure", result2);	
	}
	@Test
	@DisplayName(value = "Update Product Details using product name")
	//@Disabled
	void testUpdateProductPrice() {
		//fail("Not yet implemented");
		Product p1  = new Product(100,"TV",55000);
		Product p2  = new Product(101,"Computer",46000);
		Product p3  = new Product(102,"Pen Drive",1500);
		ProductService ps = new ProductService();
		float updatedPrice1 = ps.updateProductPrice(p1);
		float updatedPrice2 = ps.updateProductPrice(p2);
		float updatedPrice3 = ps.updateProductPrice(p3);
		assertEquals(p1.getPrice()+5000, updatedPrice1);
		assertEquals(p2.getPrice()+3000, updatedPrice2);
		assertEquals(p3.getPrice()+500, updatedPrice3);
	}
	@Test
	@DisplayName(value = "Get Product information")
	//@Disabled
	void testGetProductInfo() {
		//fail("Not yet implemented");
		ProductService ps = new ProductService();
		Product p = ps.getProductInfo();
		assertNotNull(p);
		assertEquals(1, p.getPid());
		assertEquals("Laptop", p.getPname());
		assertEquals(85000, p.getPrice());
	}
	@Test
	@DisplayName(value = "Get All Product Details")
	//@Disabled
	void testGetAllProduct() {
		//fail("Not yet implemented");
		ProductService ps = new ProductService();
		List<Product> listOfProduct = ps.getAllProduct();
		assertEquals(3, listOfProduct.size());
		Product p1 = listOfProduct.get(1);
		
		assertEquals(2, p1.getPid());
		assertEquals("Computer", p1.getPname());
		assertEquals(35000, p1.getPrice());
	}
	
	

}
