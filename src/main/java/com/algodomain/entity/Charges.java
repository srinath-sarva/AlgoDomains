package com.algodomain.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Charges {
	private double gst;
	private double delivery;
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	public Charges(double gst, double delivery) {
		super();
		this.gst = gst;
		this.delivery = delivery;
	}
	public Charges() {
		// TODO Auto-generated constructor stub
	}

}
