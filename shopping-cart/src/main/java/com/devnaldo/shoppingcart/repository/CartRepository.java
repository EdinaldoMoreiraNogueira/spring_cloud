package com.devnaldo.shoppingcart.repository;

import com.devnaldo.shoppingcart.model.Cart;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository  extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

} 
