package com.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customers.model.client;

public interface clientRepository extends JpaRepository<client, Long>{
	
}
