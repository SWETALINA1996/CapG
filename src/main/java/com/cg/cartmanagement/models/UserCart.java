package com.cg.cartmanagement.models;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@ComponentScan
//@Document(collection = "CartDetails")
public class UserCart {
	
	@Id
	String userId;
	List<CartProduct> cartProductList;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<CartProduct> getCartProductList() {
		return cartProductList;
	}
	public void setCartProductList(List<CartProduct> cartProductList) {
		this.cartProductList = cartProductList;
	}
	
	
}
