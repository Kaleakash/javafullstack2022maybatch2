package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	// custom method 
	
	@Query("select p from Product p where p.category = :category")
	public List<Product> findProductByCategory(@Param("category") String category);
}
