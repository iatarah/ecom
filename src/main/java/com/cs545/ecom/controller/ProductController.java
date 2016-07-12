package com.cs545.ecom.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.cs545.ecom.domain.Product;
import com.cs545.ecom.service.ProductService;







@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	//@RequestMapping("/")
	//public String start() {
		//return "UI/jsp/product";
	//}
	@RequestMapping("/")
	public String addNewProduct(){
	service.addNewProduct(new Product("Apple iphone", "gfgfg", "Amazing Iphone ","gfg"));
		//Product product=new Product("Apple iphone", "gfgfg", "Amazing Iphone ", new Category());
		
		//model.addAttribute("product",product);
		return "UI/jsp/product";
	}
}
