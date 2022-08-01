package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "/")
	public ModelAndView openPage() {
		ModelAndView mav = new ModelAndView();
		System.out.println("i came here");
		mav.setViewName("index.jsp");
		return mav;
	}
}
