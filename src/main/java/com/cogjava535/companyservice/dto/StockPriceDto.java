package com.cogjava535.companyservice.dto;

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
public class StockPriceDto {

	private String id;
	private String companyCode;
	private double price;
	private String date;
	private String time;
	
}
