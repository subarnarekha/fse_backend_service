package com.cogjava535.companyservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogjava535.companyservice.dto.CompanyDto;
import com.cogjava535.companyservice.service.CompanyServiceInterface;

@RestController
@RequestMapping("/market/company")
public class CompanyController {

	@Autowired
	private CompanyServiceInterface compService;
	
	@PostMapping(path="/register")
	public ResponseEntity<?> registerCompany(@RequestBody CompanyDto companyInput){
		CompanyDto companyOutput = new CompanyDto();
		companyOutput.setId(companyInput.getId());
		companyOutput.setCode(companyInput.getCode());
		companyOutput.setName(companyInput.getName());
		companyOutput.setCeo(companyInput.getCeo());
		compService.registerComapny(companyInput);
		return ResponseEntity.ok(companyOutput);
	}
	
}
