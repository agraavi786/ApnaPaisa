package com.stock.repositorty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.Entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
