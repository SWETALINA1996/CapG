package com.cg.cartmanagement.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartConfig {

	@Bean
	//@Scope("prototype")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
