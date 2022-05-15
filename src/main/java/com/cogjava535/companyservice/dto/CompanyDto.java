package com.cogjava535.companyservice.dto;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.cogjava535.companyservice.models.StockPrice;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyDto {
	
	@Id
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
