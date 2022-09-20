package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;

public class ProductDao {

	public int storeProduct(Product product) {
//		System.out.println(" i came to dao layer");
//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdb","root", "root@123");
//	PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
//	pstmt.setInt(1, product.getPid());
//	pstmt.setString(2, product.getPname());
//	pstmt.setFloat(3, product.getPrice());
//	int res = pstmt.executeUpdate();
//	return res;
//		} catch (Exception e) {
//			System.out.println(e);
//			return 0;
//		}
		return 0;
	}
	public List<Product> findAllProduct() {
		List<Product> listOfProduct = new ArrayList<Product>();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdb","root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("select * from product");
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getFloat(3));
		listOfProduct.add(p);
	}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfProduct;
	}
}
