package com.stock.service;

import org.springframework.stereotype.Service;

import com.stock.Entity.Address;

@Service
public interface AddressService {
	
	
	void updateAddress(Address add, int id);

}
