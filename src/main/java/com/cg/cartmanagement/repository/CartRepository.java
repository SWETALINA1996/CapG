package com.cg.cartmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.cartmanagement.models.CartProduct;

public interface CartRepository extends MongoRepository<CartProduct, String>{

}
