package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.bean.Account;

public class AccountServiceTest {

  @Test
  @Ignore
  public void createAccountTest() {
	  AccountService ac = new AccountService();
	  Account ac1 = new Account();
	  ac1.setAccno(100);
	  ac1.setName("Ravi");
	  ac1.setAmount(450);
	  String result1 = ac.createAccount(ac1);
	  assertEquals("You can't create the account min amount must be > 1000", result1);
	  
	  Account ac2 = new Account();
	  ac2.setAccno(101);
	  ac2.setName("Ajay");
	  ac2.setAmount(1500);
	  String result2 = ac.createAccount(ac2);
	  assertEquals("Account created successfully", result2);
    //throw new RuntimeException("Test not implemented");
  }

  @Test
  public void depositeTest() {
	  AccountService ac = new AccountService();
	  Account ac1 = new Account();
	  ac1.setAccno(1);
	  ac1.setAmount(40);
	  String result1 = ac.deposite(ac1);
	  assertEquals("Account number not exists", result1);
	  
	  Account ac2 = new Account();
	  ac2.setAccno(100);
	  ac2.setAmount(40);
	  String result2 = ac.deposite(ac2);
	  assertEquals("Your can't deposite amount becuase min 100", result2);
	  
	  Account ac3 = new Account();
	  ac3.setAccno(100);
	  ac3.setAmount(55000);
	  String result3 = ac.deposite(ac3);
	  assertEquals("You can't deposite at time more than 50000", result3);
	  
	  Account ac4 = new Account();
	  ac4.setAccno(100);
	  ac4.setAmount(1200);
	  String result4 = ac.deposite(ac4);
	  assertEquals("Amount deposited successfully", result4);
	  
  }

  @Test
  @Ignore
  public void findBalanceTest() {
    AccountService ac = new AccountService();
    String result1 = ac.findBalance(1);
    assertEquals("Amount not exists", result1);
    
    String result2 = ac.findBalance(101);
    assertEquals("Your account balance for account 101 is 1500.0", result2);
  }

  @Test
  @Ignore
  public void withdrawTest() {
    throw new RuntimeException("Test not implemented");
  }
}
