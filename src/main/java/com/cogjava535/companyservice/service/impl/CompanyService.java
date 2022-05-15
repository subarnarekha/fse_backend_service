package com.cogjava535.companyservice.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

	@Override
	public List<CompanyDto> getAllCompanies() {
		ObjectMapper objMapper = new ObjectMapper();
		List<Company> listOfCompanies = new ArrayList<>();
		compRepository.findAll().forEach(listOfCompanies::add);
		List<CompanyDto> companyList = Arrays.asList(objMapper.convertValue(listOfCompanies, CompanyDto[].class));
		return companyList;
	}

	@Override
	public CompanyDto getCompanyDetails(String id) {
		if(compRepository.existsById(id)) {
			System.out.println("Exists by Id"+id);
		}
		Optional<Company> companyInfo = compRepository.findById(id);
		System.out.println(companyInfo);
		ObjectMapper objMapper = new ObjectMapper();
		CompanyDto compOp = objMapper.convertValue(companyInfo.get(), CompanyDto.class);
		System.out.println(compOp);
		return compOp;
	}
}
