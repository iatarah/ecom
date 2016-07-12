package com.cs545.ecom.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
@Id
@GeneratedValue
@Column
	private int productId;
@Column
	private String productName;
@Column
	private String productImage;
@Column
	private String productDescription;
@Column
	private String productCategory;
    public Product(){};
	public Product(String productName, String productImage, String productDescription, String productCategory) {
		super();
		this.productName = productName;
		this.productImage = productImage;
		this.productDescription = productDescription;
		this.productCategory = productCategory;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
