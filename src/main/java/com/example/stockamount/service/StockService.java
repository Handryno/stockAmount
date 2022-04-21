package com.example.stockamount.service;

import com.example.stockamount.dto.Stock;
import com.example.stockamount.dto.StockResponse;
import com.example.stockamount.dto.SubStockRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StockService {
    private static Map<Long, Stock> stockHashMap = new HashMap<>();

        static {
        Stock stock1 = new Stock(1, "ABC", 100);
        Stock stock2  = new Stock(2, "DEF", 200);
        stockHashMap.put(1L, stock1);
        stockHashMap.put(2L, stock2);
    }
    public static List<Stock> getAllStocks(){
        return new ArrayList<>(stockHashMap.values());
    }

    public static Stock getStockDetails(Long id){
        return stockHashMap.get(id);
    }

    public static StockResponse subStock(Long id, SubStockRequest subStockRequest, int amount){
        subStockRequest.setId(id);
        subStockRequest.setAmount(amount);
        if (stockHashMap.get(id).getRemainingAmount() < amount){
            return new StockResponse("error","stock tidak mencukupi", new Stock(id,stockHashMap.get(id).getName(),stockHashMap.get(id).getRemainingAmount()));

        }
        stockHashMap.put(id, new Stock(id,stockHashMap.get(id).getName(),stockHashMap.get(id).getRemainingAmount() - amount));
        return new StockResponse("success", "Stock berhasil dikurangi", stockHashMap.get(id));
    }

}
