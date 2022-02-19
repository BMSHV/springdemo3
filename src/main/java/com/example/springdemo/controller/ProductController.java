package com.example.springdemo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.bean.Product;

@RestController
public class ProductController {
	
    //Displaying single product details:
	
	@GetMapping("/product")
	public Product getProduct() {
		
		Product product = new Product();
		product.setProductId(101);
		product.setName("IphoneSE");
		product.setPrice(45999.00);
		
		return product;
		
	}	
	
	//Displaying list of products using list:
	
	@GetMapping("/listofproducts")
	public List<Product> getAllProducts(){
		
		Product product = new Product();
		product.setProductId(100);
		product.setName("IphoneSE");
		product.setPrice(45999.00);
		
		Product product1 = new Product();
		product1.setProductId(102);
		product1.setName("IphoneX");
		product1.setPrice(155999.00);
		
		Product product2 = new Product();
		product2.setProductId(103);
		product2.setName("Iphone1");
		product2.setPrice(55999.00);
		
		
		Product product3 = new Product();
		product3.setProductId(104);
		product3.setName("Iphone2");
		product3.setPrice(45999.00);
		
		
		Product product4 = new Product();
		product4.setProductId(105);
		product4.setName("Iphone4");
		product4.setPrice(44999.00);
		
		List<Product> list = new ArrayList<>();
		list.add(product4);
		list.add(product3);
		list.add(product2);
		list.add(product1);
		list.add(product);
		
		return list;
		
	}
	
	@PostMapping("/product")
	public String addProduct(@RequestBody Product product) {
		
		return "Product Saved" + product.getProductId();
		
	}
		
	}
