package com.algodomain.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product222")
public class Product {

	
	@Id
	private long id;
	private String prodName;
	private String prodType;
	private String prodCategory;
	private double prodPrice;
	private double discount;
	private double finalPrice;
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Charges getCharges() {
		return charges;
	}
	public void setCharges(Charges charges) {
		this.charges = charges;
	}


	@Embedded

	private Charges charges;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	
	public Product(long id, String prodName, String prodType, String prodCategory, double prodPrice, double discount,
			double finalPrice, Charges charges) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodType = prodType;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
		this.discount = discount;
		this.finalPrice = finalPrice;
		this.charges = charges;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
