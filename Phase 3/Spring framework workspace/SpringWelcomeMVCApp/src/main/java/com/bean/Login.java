package com.bean;

import org.springframework.stereotype.Component;

@Component		
public class Login {
private String emailid;
private String password;
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Login [emailid=" + emailid + ", password=" + password + "]";
}

}
