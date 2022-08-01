package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "findAllProduct",method = RequestMethod.GET)
	public ModelAndView displayAllProduct() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayProduct.jsp");
		List<Product> listOfProdcut = productService.findAllProducts();
		mav.addObject("listOfProduct", listOfProdcut);
		return mav;
	}
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Product product) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		String pname = req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		
		product.setPid(pid);
		product.setPname(pname);
		product.setPrice(price);
		
		String result = productService.storeProduct(product);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("storeProduct.jsp");
		mav.addObject("msg", result);
		
		return mav;
	}
	
	
	@RequestMapping(value = "updateProduct",method = RequestMethod.POST)
	public ModelAndView updateProduct(HttpServletRequest req, Product product) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		float price = Float.parseFloat(req.getParameter("price"));
		
		product.setPid(pid);
		product.setPrice(price);
		
		String result = productService.updateProduct(product);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("updateProduct.jsp");
		mav.addObject("msg", result);
		
		return mav;
	}
	
	@RequestMapping(value = "deleteProduct",method = RequestMethod.GET)
	public ModelAndView deleteProduct(HttpServletRequest req) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		
		String result = productService.deleteProduct(pid);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("deleteProduct.jsp");
		mav.addObject("msg", result);
		
		return mav;
	}
}
