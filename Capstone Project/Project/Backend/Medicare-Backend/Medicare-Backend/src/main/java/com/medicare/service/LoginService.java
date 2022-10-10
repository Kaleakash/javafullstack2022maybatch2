package com.medicare.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medicare.entity.Login;
import com.medicare.repository.LoginRepository;

@Service
public class LoginService {


	@Autowired
	LoginRepository loginRepository;
	
	public String signIn(Login login) {
		Optional<Login> result	= loginRepository.findById(login.getEmailid());
		
		if(result.isPresent()) {
			Login ll =result.get();
			
			if(ll.getPassword().equals(login.getPassword())) {
					
					if(ll.getTypeOfUser().equals("admin")) {
						return "Admin login successfully";
					}else {
						return "User login successfully";
					}
					
			}else {
				return "InValid Password";
			}
			
		}else {
			return "Invalid emailId";
		}				
	}
	
	public String signUp(Login login) {
		Optional<Login> result	= loginRepository.findById(login.getEmailid());
		
		if(result.isPresent()) {
			return "Account alreay exists";
		}else {
			
			if(login.getTypeOfUser().equals("admin")) {
				return "You can't create the admin account";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}
		}	
	}
}
