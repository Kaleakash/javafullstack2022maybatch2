package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Account;

public class AccountDao {

	public String createAccount(Account account) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdb", "root","root@123");
	PreparedStatement pstmt = con.prepareStatement("insert into account values(?,?,?)");
	pstmt.setInt(1, account.getAccno());
	pstmt.setString(2, account.getName());
	pstmt.setFloat(3, account.getAmount());
	int res = pstmt.executeUpdate();
	if(res>0) {
		return "Account created successfully";
	}
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;
	}
	public float getBalance(int accno) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdb", "root","root@123");
	PreparedStatement pstmt = con.prepareStatement("select * from Account where accno=?");
	pstmt.setFloat(1, accno);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		return rs.getFloat(3);
	}
		} catch (Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	public float widthdraw(Account account) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdb", "root","root@123");
	PreparedStatement pstmt = con.prepareStatement("update account set amount = amount - ? where accno=?");
	pstmt.setFloat(1, account.getAmount());
	pstmt.setInt(2, account.getAccno());
	int res = pstmt.executeUpdate();
	return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public float deposit(Account account) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdb", "root","root@123");
	PreparedStatement pstmt = con.prepareStatement("update account set amount = amount + ? where accno=?");
	pstmt.setFloat(1, account.getAmount());
	pstmt.setInt(2, account.getAccno());
	int res = pstmt.executeUpdate();
	return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
