package com.cogjava535.companyservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cogjava535.companyservice.dao.CompanyRepository;
import com.cogjava535.companyservice.dto.CompanyDto;
import com.cogjava535.companyservice.models.Company;
import com.cogjava535.companyservice.service.CompanyServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CompanyService implements CompanyServiceInterface{
	
	@Autowired
	CompanyRepository compRepository;
	
	@Override
	@Transactional
	public CompanyDto registerComapny(CompanyDto companyInput) {
		ObjectMapper objMapper = new ObjectMapper();
		Company company = objMapper.convertValue(companyInput, Company.class);
		System.out.println("Company Object {}"+company);
		company = compRepository.save(company);
		CompanyDto compOp = objMapper.convertValue(company, CompanyDto.class);
		System.out.println("Company Output after save {}"+company);
		return compOp;
	}
}
