package com.cogjava535.companyservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	
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
