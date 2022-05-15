package com.cogjava535.companyservice.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
	
	private List<StockPrice> stockPriceList; 
	
}
