package com.cogjava535.companyservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
	
	private String id;
	private String name;
	private String code;
	private String turnover;
	private String ceo;
	private String boardOfDirs;
	private String stockExchangeNames;
	private String sectorName;
	private String description;
}
