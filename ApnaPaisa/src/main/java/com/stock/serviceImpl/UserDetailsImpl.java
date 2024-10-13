package com.stock.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.Entity.Address;
import com.stock.Entity.UserDetails;
import com.stock.repositorty.AddressRepository;
import com.stock.repositorty.UserDetailsRepository;
import com.stock.service.UserDetailService;

@Service
public class UserDetailsImpl implements UserDetailService{
	
	 @Autowired
	  private UserDetailsRepository userDetailsRepository;
	 
	 @Autowired
	 AddressRepository addressRepository;

	@Override
	public void addUsers(UserDetails us) {
		UserDetails addUser = new UserDetails();
		
		addUser.setAdharCard(us.getAdharCard());
        addUser.setName(us.getName());
        addUser.setMobileNo(us.getMobileNo());
        addUser.setPanCard(us.getPanCard());
        addUser.setTotalBalance(us.getTotalBalance());
        addUser.setProfitBalance(us.getProfitBalance());
        addUser.setPerProfit(us.getPerProfit());
        addUser.setTotalInvest(us.getTotalInvest());
     
        
        Address add = new Address();
        
        	add.setHouseAddress(us.getAddress().getHouseAddress());
        	add.setCity(us.getAddress().getCity());
        	add.setState(us.getAddress().getState());
        	add.setCountry(us.getAddress().getCountry());
        	add.setUserDetail(addUser);
        	addUser.setAddress(add);
     
        
        //addressRepository.save(add);
        userDetailsRepository.save(addUser);
		
		
	}

	
}
