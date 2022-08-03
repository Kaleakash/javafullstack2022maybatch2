package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public String signIn(Login login) {
		Login ll  = loginRepository.checkLoginDetails(login.getEmailid(), login.getPassword());
		if(ll==null) {
			return "failure";
		}else if(ll.getTypeofuser().equals("admin")) {
			return "admin success";
		}else {
			return "user success";
		}
	}
	
	public String signUp(Login login) {
		if(login.getTypeofuser().equals("admin")) {
			return "You Can't create Admin Account";
		}else {
			Optional<Login> result = loginRepository.findById(login.getEmailid());
			if(result.isPresent()) {
				return "Email Id must be unique";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}
		}
	}
}
