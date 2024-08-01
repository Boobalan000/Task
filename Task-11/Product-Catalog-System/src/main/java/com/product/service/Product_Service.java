package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface Product_Service {

	Product saveProduct(Product product);
	
	List<Product>getAllProduct();
}
