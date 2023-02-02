package com.algodomain.service;

import java.util.List;

import com.algodomain.entity.Product;

public interface ProductService {
	public Product createProduct(Product prod);
	public void deleteProduct(Long id);
	public Product updateProduct(Long id, Product prod);
	public List<Product> getAllProducts();
	public Product getProductById(Long id);
	

}
