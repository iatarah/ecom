/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecom.repository.interfac;


import java.util.List;

import com.cs545.ecom.domain.Product;


public interface ProductDAO {

    Product findById(int id);

    void saveProduct(Product employee);

    void deleteProductById(String empId);

    List<Product> findAllProducts();

    Product findProductById(String empId);
}
