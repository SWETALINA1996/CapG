package com.cg.cartmanagement.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cartmanagement.models.CartProduct;
import com.cg.cartmanagement.repository.CartRepository;


@Service
public class AddProductCartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private CartProduct product = null;
	
	public void addProduct(CartProduct cartProduct) {
		try {
			Optional<CartProduct> optionalCart = cartRepository.findById(cartProduct.getId());
			if(optionalCart.isPresent()) {
				product = modelMapper.map(cartProduct, CartProduct.class);
				cartRepository.save(product);
			}
	
			cartRepository.save(cartProduct);
			
		}catch (RuntimeException e) {
			throw new RuntimeException("Error Performing operation!!!" + e.getMessage());
		}
	}
	
}
