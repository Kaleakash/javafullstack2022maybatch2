package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller								// it is a like a servlet 
public class SampleController {

	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		// logic 
		System.out.println("I Came Here");
		ModelAndView mav  =new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	}
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public ModelAndView sayHi() {
		
		System.out.println("I Came Here");
		ModelAndView mav  =new ModelAndView();
		mav.setViewName("display1.jsp");
		return mav;
		
	}
}
