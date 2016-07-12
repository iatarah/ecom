package com.cs545.ecom.service;

import java.util.List;

import com.cs545.ecom.domain.Product;

public interface ProductService {
	void addNewProduct(Product product);
	List<Product> getAllProducts();
}
