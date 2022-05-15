package com.cogjava535.companyservice.service;

import java.util.List;

import com.cogjava535.companyservice.dto.CompanyDto;

public interface CompanyServiceInterface {

	public CompanyDto registerComapny(CompanyDto companyInput);

	public List<CompanyDto> getAllCompanies();

	public CompanyDto getCompanyDetails(String id);
}
