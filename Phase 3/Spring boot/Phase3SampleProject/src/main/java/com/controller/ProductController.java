package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Product pr) {
		
		String pname = req.getParameter("pname");
		String category = req.getParameter("category");
		String url= req.getParameter("url");
		float price= Float.parseFloat(req.getParameter("price"));
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		
		pr.setPname(pname);
		pr.setCategory(category);
		pr.setUrl(url);
		pr.setPrice(price);
		pr.setQuantity(quantity);
	
		String result = productService.storeProdcut(pr);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("storeProduct.jsp");
		mav.addObject("msg", result);
		return mav;
	}
	
	@RequestMapping(value = "displayAllProduct",method = RequestMethod.GET)
	public ModelAndView getAllProduct() {
	
		List<Product> listOfProduct = productService.findAllProduct();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfProduct", listOfProduct);
		mav.setViewName("displayProduct.jsp");
		return mav;
	}
	
	@RequestMapping(value = "displayAllProductByCategory",method = RequestMethod.GET)
	public ModelAndView getAllProductByCategory(HttpServletRequest req) {
		String category = req.getParameter("category");
		
		List<Product> listOfProduct = productService.findProductByCategory(category);
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfProduct", listOfProduct);
		mav.setViewName("displayProductByCategory.jsp");
		return mav;
	}
	
	@RequestMapping(value = "updateProduct",method = RequestMethod.POST)
	public ModelAndView updateProduct(HttpServletRequest req, Product pr) {
		int pid = Integer.parseInt(req.getParameter("pid"));
		float price =Float.parseFloat(req.getParameter("price"));
		int quantity = Integer.parseInt(req.getParameter("quantity"));
				
		pr.setPid(pid);
		pr.setPrice(price);
		pr.setQuantity(quantity);
		
		String result = productService.updateProduct(pr);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("updateProduct.jsp");
		return mav;
	}
	
}
