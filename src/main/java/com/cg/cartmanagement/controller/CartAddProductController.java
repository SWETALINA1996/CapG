package com.cg.cartmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cartmanagement.models.CartProduct;
import com.cg.cartmanagement.services.AddProductCartService;

@RequestMapping("/api/v1/user-cart")
@RestController
public class CartAddProductController {

	@Autowired
	AddProductCartService addProductCartService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addToCart(CartProduct cartProduct) {
		addProductCartService.addProduct(cartProduct);
	}
}
