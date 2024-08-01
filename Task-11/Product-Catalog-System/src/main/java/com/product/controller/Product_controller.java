package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.product.entity.Product;
import com.product.service.Product_Service;

@Controller
public class Product_controller {

	@Autowired
	private Product_Service product_service;
	
	
	@GetMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@GetMapping("/add")
	public String addPage(Model model)
	{
		Product product=new Product();
		model.addAttribute("product",product);
		return "add_page";
	}
	
	@PostMapping("/")
	public String saveProduct(@ModelAttribute("product") Product product)
	{
		product_service.saveProduct(product);
		return "redirect:/";
	}
	
	@GetMapping("/display")
	public String displayPage(Model model)
	{
		model.addAttribute("product",product_service.getAllProduct());
		return "display_page";
	}
}
