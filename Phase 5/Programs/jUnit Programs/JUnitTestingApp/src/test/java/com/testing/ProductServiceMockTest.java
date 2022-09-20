package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bean.Product;
import com.dao.ProductDao;
import com.service.ProductService;

@ExtendWith(MockitoExtension.class)				// This run as Mocking 
class ProductServiceMockTest {

	@Mock
	ProductDao productDao;
	
	@InjectMocks
	ProductService productService;
	
	@Test
	@Disabled
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
	void testGetAllProductFromDb() {
		//fail("Not yet implemented");
		
		// Provide fake data 
		List<Product> fakeListOfProduct = new ArrayList<Product>();
		Product p1 = new Product(1,"A",100);
		Product p2 = new Product(2,"C",200);
		fakeListOfProduct.add(p1);
		fakeListOfProduct.add(p2);
		// expose fake data 
		
		//Mockito.when(productDao.findAllProduct()).thenReturn(fakeListOfProduct);			// This code for fake test 
		
		Mockito.when(productDao.findAllProduct()).thenCallRealMethod();					// This code for actual test 
		
		
		List<Product> listOfProduct = productService.getAllProductFromDb();
		assertEquals(2, listOfProduct.size());
		Product p = listOfProduct.get(0);
		assertEquals(1, p.getPid());
		assertEquals("TV", p.getPname());
		assertEquals(56000.0, p.getPrice());
	}

}
