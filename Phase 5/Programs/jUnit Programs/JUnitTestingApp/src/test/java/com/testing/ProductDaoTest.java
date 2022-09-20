package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bean.Product;
import com.dao.ProductDao;

class ProductDaoTest {
	
	static ProductDao pd;
	static Product p;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		pd = new ProductDao();	
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		pd = null;
	}
	@BeforeEach
	void setUp() throws Exception {
		p = new Product();
		p.setPid(3);
		p.setPname("Pen Drive");
		p.setPrice(1200);
	}
	@AfterEach
	void tearDown() throws Exception {
		p = null;
	}
	@Test
	@DisplayName(value = "Store Product In DB")
	@Disabled
	void testStoreProduct() {
				//int res = pd.storeProduct(p);
				//assertEquals(1, res);
		
				int res = pd.storeProduct(p);		// duplicate key 
				assertEquals(0, res);
	}
	@Test
	//@Disabled
	@DisplayName(value = "Check product details from DB")
	void testFindAllProduct() {
		List<Product> listOfProduct = pd.findAllProduct();
		assertEquals(2, listOfProduct.size());
		Product p   = listOfProduct.get(0);
		assertEquals(1, p.getPid());
		assertEquals("TV", p.getPname());
		assertEquals(56000.0f, p.getPrice());
	}

}
