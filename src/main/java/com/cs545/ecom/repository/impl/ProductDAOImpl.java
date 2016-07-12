/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecom.repository.impl;


import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cs545.ecom.domain.Product;
import com.cs545.ecom.repository.abstrac.AbstractDAO;
import com.cs545.ecom.repository.interfac.ProductDAO;


@Repository
public class ProductDAOImpl extends AbstractDAO<Integer, Product> implements ProductDAO {

	public Product findById(int id) {
		 return getByKey(id);
	}

	public void saveProduct(Product product) {
		 persist(product);
		
	}

	public void deleteProductById(String empId) {
		 Query query = getSession().createSQLQuery("delete from Employee where employee_id=:empId");
	        query.setString("empId", empId);
	        query.executeUpdate();
		
	}

	public List<Product> findAllProducts() {
		 Criteria criteria = createEntityCriteria();
	        return (List<Product>) criteria.list();
	}

	public Product findProductById(String empId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("employeeId", empId));
        return (Product) criteria.uniqueResult();
	}

   
}
