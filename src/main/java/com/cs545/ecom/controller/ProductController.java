package com.cs545.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs545.ecom.domain.Product;
import com.cs545.ecom.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@RequestMapping("/")
	public String getAllProducts(Model model) {
		List<Product> products = service.getAllProducts();
		model.addAttribute("products", products);
		return "UI/jsp/products";
	}

	@RequestMapping("/addproduct")
	public String addNewProduct() {
		service.addNewProduct(new Product("Apple iphone", "gfgfg", "Amazing Iphone ", "gfg"));
		// Product product=new Product("Apple iphone", "gfgfg", "Amazing Iphone
		// ", new Category());

		// model.addAttribute("product",product);
		return "UI/jsp/product";
	}
}
