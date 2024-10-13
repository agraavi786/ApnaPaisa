package com.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.Entity.UserDetails;
import com.stock.repositorty.UserDetailsRepository;
import com.stock.serviceImpl.UserDetailsImpl;

@RestController
@RequestMapping("/userDetails")
public class UserDetailsController {
//	static List<UserDetails> list=null;
//	static {
//		 list = new ArrayList<>();
//		list.add(new UserDetails("Avaneet","UP"));
//		list.add(new UserDetails("Avaneet1","UP"));
//		list.add(new UserDetails("Avaneet2","UP2"));
//		list.add(new UserDetails("Avaneet3","UP3"));
//		
//	}

	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Autowired
	UserDetailsImpl userDetailsImpl;

	@GetMapping("/get")
	public ResponseEntity<List<UserDetails>> getUserDetails() {
		List<UserDetails> findAll = userDetailsRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(findAll);
	}

	@PostMapping("/addUser")
	public ResponseEntity<?> addUsersDetails(@RequestBody UserDetails ud) {
		userDetailsImpl.addUsers(ud);
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

}
