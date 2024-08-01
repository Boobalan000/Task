package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.entity.*;

public interface Product_Repository extends JpaRepository<Product,Long>{
	
}