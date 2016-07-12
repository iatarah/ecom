package com.cs545.ecom.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cs545.ecom.domain.Product;
import com.cs545.ecom.repository.interfac.ProductDAO;
import com.cs545.ecom.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO repository;

	public void addNewProduct(Product product) {
		repository.saveProduct(product);
		
	}

	

}
