package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductService;


@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;

	@RequestMapping(value = "storeProduct", method = RequestMethod.POST)
	public ModelAndView storeEmployee(HttpServletRequest req, Product pro, HttpSession hs) {
		
		pro.setId(Integer.parseInt(req.getParameter("id")));
		pro.setName(req.getParameter("name"));
		pro.setPrice(Float.parseFloat(req.getParameter("price")));
		pro.setQuantity(Integer.parseInt(req.getParameter("quantity")));
		
		String result = productService.storeProduct(pro);
		
		hs.setAttribute("msg", result);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping(value = "getAllProduct")
	public List<Product> getAllProduct() {
	return productService.getProduct();
	}

	
}
