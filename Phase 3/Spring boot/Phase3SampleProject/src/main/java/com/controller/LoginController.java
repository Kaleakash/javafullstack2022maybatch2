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
	
	@RequestMapping(value = "/")
	public ModelAndView openLoginPage() {
		ModelAndView mav= new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
	
	@RequestMapping(value = "signIn",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req, Login ll) {
		
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		String typeofuser = req.getParameter("typeofuser");
		
		ll.setEmailid(emailid);
		ll.setPassword(password);
		ll.setTypeofuser(typeofuser);
		
		String result = loginService.signIn(ll);
		
		ModelAndView mav = new ModelAndView();
		
		if(result.equals("failure")) {
			mav.addObject("msg", "failure try once again");
			mav.setViewName("index.jsp");
			
		}else if(result.equals("admin success")) {
			mav.addObject("msg", "Welcome to home page admin");
			mav.setViewName("adminHome.jsp");
		}else {
			mav.addObject("msg", "Welcome to home page "+ll.getEmailid());
			mav.setViewName("userHome.jsp");
		}
		return mav;
	}
	
	
	
	@RequestMapping(value = "signUp",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req, Login ll) {
		
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		String typeofuser = req.getParameter("typeofuser");
		
		ll.setEmailid(emailid);
		ll.setPassword(password);
		ll.setTypeofuser(typeofuser);
		
		String result = loginService.signUp(ll);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("index.jsp");
			
		
		return mav;
	}
}
