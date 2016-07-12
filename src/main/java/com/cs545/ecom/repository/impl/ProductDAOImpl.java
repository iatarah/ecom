
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

	public void deleteProductById(String pId) {
		 Query query = getSession().createSQLQuery("delete from Product where productId=:pId");
	        query.setString("pId", pId);
	        query.executeUpdate();
		
	}

	public List<Product> findAllProducts() {
		 Criteria criteria = createEntityCriteria();
	        return (List<Product>) criteria.list();
	}

	public Product findProductById(String pId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("productId", pId));
        return (Product) criteria.uniqueResult();
	}

   
}
