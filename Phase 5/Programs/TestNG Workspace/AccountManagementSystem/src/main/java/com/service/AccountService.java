package com.service;

import com.bean.Account;
import com.dao.AccountDao;

public class AccountService {

	AccountDao ad = new AccountDao();
	
	public String createAccount(Account account) {
		if(account.getAmount()<1000) {
			return "You can't create the account min amount must be > 1000";
		}else {
			return ad.createAccount(account);
		}
	}
	
	public String findBalance(int accno) {
		float balanceAmount = ad.getBalance(accno);
		if(balanceAmount==-1) {
			return "Amount not exists";
		}else {
			return "Your account balance for account "+accno+" is "+ad.getBalance(accno);
		}
	}
	
	// min 500 
	public String withdraw(Account account) {
		float balanceAmount = ad.getBalance(account.getAccno());
		if(balanceAmount == -1) {
			return "Account number not exists";
		}else if(balanceAmount <=500) {
			return "You can't withdrawn because you have to maintain min balance 500";
		}else if(ad.widthdraw(account)>0) {
			return "Amount withdrawn successfully";
		}else {
			return "Amount didn't deposite";
		}
	}
	
	public String deposite(Account account) {
		float balanceAmount = ad.getBalance(account.getAccno());
		if(balanceAmount == -1) {
			return "Account number not exists";
		}else if(account.getAmount() > 50000) {
			return "You can't deposite at time more than 50000";
		}else if(account.getAmount() < 100) {
			return "Your can't deposite amount becuase min 100";
		}else if(ad.deposit(account)>0) {
			return "Amount deposited successfully";
		}else {
			return "Amount didn't deposite";
		}
	}
	
}
