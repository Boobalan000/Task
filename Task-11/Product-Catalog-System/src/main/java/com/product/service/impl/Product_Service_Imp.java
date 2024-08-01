package com.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.Product_Repository;
import com.product.service.Product_Service;

@Service
public class Product_Service_Imp implements Product_Service{

	@Autowired
	private Product_Repository product_repository;
	
	@Override
	public Product saveProduct(Product product) {
		return product_repository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return product_repository.findAll();
	}

}
