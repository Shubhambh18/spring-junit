package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Payment {

	
	private long paymentId;
	private String description;
	private double amount;
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(long paymentId, String description, double amount) {
		super();
		this.paymentId = paymentId;
		this.description = description;
		this.amount = amount;
	}
	
}

 
