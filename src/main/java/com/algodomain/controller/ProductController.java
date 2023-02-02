package com.algodomain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.algodomain.entity.Product;
import com.algodomain.service.ProductServiceImpl;

@RestController
public class ProductController {

	
	@Autowired
	private ProductServiceImpl service;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product prod )
	
	{
		return service.createProduct(prod);
	}
	
	@GetMapping("/getAll")
	public List<Product> getAll(){
		
		return service.getAllProducts();
	}
	
	@GetMapping("/get/{id}")
	public Product getById(@PathVariable Long id) {
		
		return service.getProductById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deletById(@PathVariable Long id) {
		 service.deleteProduct(id);
	}
	
	
	
	@PutMapping("/update/{id}")
	public Product updateProduct(@RequestBody Product prod, @PathVariable Long id) {
		return service.updateProduct(id, prod);
	}
	
	
}
