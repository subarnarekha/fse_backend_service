package com.cogjava535.companyservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StockPrice {
	
	private String id;
	private String companyCode;
	private double price;
	private String date;
	private String time;
	

}
