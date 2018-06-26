package com.yuzhou.model;

import lombok.Data;

@Data
public class Order {
	
	private String userName;
	
	private String product;

	@Override
	public String toString() {
		return "Order [userName=" + userName + ", product=" + product + "]";
	}
	
}
