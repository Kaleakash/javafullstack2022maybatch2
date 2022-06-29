package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();
	
	public String signUp(Login ll) {
		StringBuffer sb = new StringBuffer(ll.getPassword());
		ll.setPassword(sb.reverse().toString());     // it will convert our password in reverse format ie 1234 then password as 4321
		
		if(ld.signUp(ll)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create email id must be unique";
		}
	}
	
	public String signIn(Login ll) {
		StringBuffer sb = new StringBuffer(ll.getPassword());
		ll.setPassword(sb.reverse().toString());     // it will convert our password in reverse format ie 1234 then password as 4321
		
		if(ld.signIn(ll)>0) {
			return "success";
		}else {
			return "failure";
		}
	}
}
