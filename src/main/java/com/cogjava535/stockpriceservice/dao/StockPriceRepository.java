package com.cogjava535.stockpriceservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogjava535.companyservice.models.StockPrice;

@Repository
public interface StockPriceRepository extends CrudRepository<StockPrice, Integer> {

}
