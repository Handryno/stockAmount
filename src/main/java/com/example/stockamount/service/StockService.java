package com.example.stockamount.service;

import com.example.stockamount.dto.Stock;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StockService {
    private static Map<Long, Stock> stockHashMap = new HashMap<>();
    private static int amount;
    static {
        Stock stock1 = new Stock(1, "ABC", 100);
        stockHashMap.put(1L, stock1);
    }
    public static List<Stock> getAllStocks(){
        return new ArrayList<>(stockHashMap.values());
    }

    public static Stock getStockDetails(Long id){
        return stockHashMap.get(id);
    }

    public static int subStock(Stock stock, int amount){
        remainingAmount -= amount;
        stock.setRemainingAmount(remainingAmount);
        stockHashMap.put(id, stock);
        return stock;
    }

}
