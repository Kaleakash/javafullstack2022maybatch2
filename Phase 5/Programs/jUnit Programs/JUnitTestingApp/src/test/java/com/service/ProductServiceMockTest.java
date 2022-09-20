package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bean.Product;
import com.dao.ProductDao;

@ExtendWith(MockitoExtension.class)				// This run as Mocking 
class ProductServiceMockTest {

	@Mock
	ProductDao productDao;
	
	@InjectMocks
	ProductService productService;
	
	@Test
	void testStoreProdutInDb() {
		//fail("Not yet implemented");
		
		// Now we have to provide fake data for DAO layer
//		Product p = new Product(1, "TV", 45000);
//		Mockito.when(productDao.storeProduct(p)).thenReturn(1);
//		
//		String res = productService.storeProdutInDb(p);
//		assertEquals("Product Stored successfully", res);
		
		
//		Product p = new Product(1, "TV", 45000);
//		Mockito.when(productDao.storeProduct(p)).thenReturn(0);
//		
//		String res = productService.storeProdutInDb(p);
//		assertEquals("Product details didn't store", res);
		
		
		Product p = new Product(1, "TV", 400);
		//Mockito.when(productDao.storeProduct(p)).thenReturn(1);
		
		String res = productService.storeProdutInDb(p);
		assertEquals("Product price must be >500", res);
		
	}

	@Test
	@Disabled
	void testGetAllProductFromDb() {
		//fail("Not yet implemented");
	}

}
