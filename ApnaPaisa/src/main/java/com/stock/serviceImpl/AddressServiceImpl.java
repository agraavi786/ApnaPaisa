package com.stock.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.Entity.Address;
import com.stock.Entity.UserDetails;
import com.stock.repositorty.AddressRepository;
import com.stock.repositorty.UserDetailsRepository;
import com.stock.service.AddressService;

@Service
public class AddressServiceImpl  implements AddressService{
	
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public void updateAddress(Address add, int id) {
		Optional<UserDetails> us = userDetailsRepository.findById(id);
		if(us.isPresent()) {
			Address addAddress = us.get().getAddress();
			addAddress.setHouseAddress(add.getHouseAddress());
			addAddress.setCity(add.getCity());
			addAddress.setState(add.getState());
			addAddress.setCountry(add.getCountry());
			//addressRepository.save(addAddress);
			us.get().setAddress(addAddress);
			userDetailsRepository.save(us.get());
			
		}
		
		
	}

}
