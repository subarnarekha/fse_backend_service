package com.cogjava535.companyservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cogjava535.companyservice.models.Company;

public interface CompanyRepository extends MongoRepository<Company, String>{
	
}
