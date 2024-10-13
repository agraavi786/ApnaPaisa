package com.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.Entity.Address;
import com.stock.repositorty.AddressRepository;
import com.stock.repositorty.UserDetailsRepository;
import com.stock.serviceImpl.AddressServiceImpl;

@RestController
public class AddressController {

	@Autowired
	AddressServiceImpl addressServiceImpl;

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	UserDetailsRepository userDetailsRepository;

	@GetMapping("/getAddress")
	public ResponseEntity<List<Address>> getAddress() {
		List<Address> allUserAdd = addressRepository.findAll();
		return ResponseEntity.status(HttpStatus.FOUND).body(allUserAdd);
	}

	@PutMapping("/updateAddress/{id}")
	public ResponseEntity<?> updateAddress(@RequestBody Address add, @PathVariable("id") int id) {
		addressServiceImpl.updateAddress(add, id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}

}
