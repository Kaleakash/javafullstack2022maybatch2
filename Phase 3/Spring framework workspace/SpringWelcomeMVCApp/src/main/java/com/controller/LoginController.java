package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public ModelAndView checkUserDetails(HttpServletRequest req) {  // DI for HttpServletRequest
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ModelAndView mav = new ModelAndView();
		if(email.equals("raj@gmail.com") && password.equals("123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	
	@RequestMapping(value = "checkUserFromDb",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req, Login ll) {    // DI for request object and user-defined object 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		ll.setEmailid(emailid);
		ll.setPassword(password);
		
		String result = loginService.signIn(ll);
		ModelAndView mav = new ModelAndView();
		if(result.equals("success")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	@RequestMapping(value = "storeUserIntoDb",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req, Login ll) {    // DI for request object and user-defined object 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		ll.setEmailid(emailid);
		ll.setPassword(password);
		
		String result = loginService.signUp(ll);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);                // request.setAttribute("msg",result);
		mav.setViewName("signUp.jsp");
		return mav;
	}
	
}
