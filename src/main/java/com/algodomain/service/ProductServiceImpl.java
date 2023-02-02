package com.algodomain.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.entity.Charges;
import com.algodomain.entity.Product;
import com.algodomain.repo.ProductRepo;


@Service

public class ProductServiceImpl implements  ProductService {
	
	
	@Autowired
	private ProductRepo repo;
	

	@Override
	public Product createProduct(Product prod) {
		double discount=0;
		double gst=0;
		double delivery=0;
		double finalPrice=0;
		if(prod.getProdCategory().equals("Electronics")) {
			discount=0.15*prod.getProdPrice();
			gst=0.18*prod.getProdPrice();
			delivery=350;
		}
		if(prod.getProdCategory().equals("Home Appliances")) {
			discount=0.22*prod.getProdPrice();
			gst=0.24*prod.getProdPrice();
			delivery=800;
		}if(prod.getProdCategory().equals("Clothing"))   {
			discount=0.4*prod.getProdPrice();
			gst=0.12*prod.getProdPrice();
			delivery=0;
		}if(prod.getProdCategory().equals("Furniture")) {
			discount=0.10*prod.getProdPrice();
			gst=0.18*prod.getProdPrice();
			delivery=300;
		}
		 
		finalPrice=prod.getProdPrice()+delivery+gst;
		prod.setDiscount(discount);
		prod.setCharges(new Charges(gst,delivery));
		prod.setFinalPrice(finalPrice);
		
		return repo.save(prod);
	}

	@Override
	public void deleteProduct(Long id) {
	repo.deleteById(id);
		
	}

	@Override
	public Product updateProduct(Long id, Product prod) {
		double discount=0;
		double gst=0;
		double delivery=0;
		double finalPrice=0;
		if(prod.getProdCategory().equals("Electronics")) {
			discount=0.15*prod.getProdPrice();
			gst=0.18*prod.getProdPrice();
			delivery=350;
		}
		if(prod.getProdCategory().equals("Home Appliances")) {
			discount=0.22*prod.getProdPrice();
			gst=0.24*prod.getProdPrice();
			delivery=800;
		}if(prod.getProdCategory().equals("Clothing"))   {
			discount=0.4*prod.getProdPrice();
			gst=0.12*prod.getProdPrice();
			delivery=0;
		}if(prod.getProdCategory().equals("Furniture")) {
			discount=0.10*prod.getProdPrice();
			gst=0.18*prod.getProdPrice();
			delivery=300;
		}
		 
		finalPrice=prod.getProdPrice()+delivery+gst;
		prod.setDiscount(discount);
		prod.setCharges(new Charges(gst,delivery));
		prod.setFinalPrice(finalPrice);
		
		return repo.save(prod);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	
	
	
	
	
	
	
	

}
