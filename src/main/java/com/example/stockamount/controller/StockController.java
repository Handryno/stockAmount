package com.example.stockamount.controller;

import com.example.stockamount.dto.Stock;
import com.example.stockamount.dto.StockResponse;
import com.example.stockamount.dto.SubStockRequest;
import com.example.stockamount.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {

    @GetMapping("/getStocks")
    public List<Stock> getAllStocks(){
        return StockService.getAllStocks();
    }

    @GetMapping("/{id}")
    public Stock getIdStock(@PathVariable Long id){
        return StockService.getStockDetails(id);
    }

//    @PostMapping(value = "/subStock")
//    public Stock subStock(@RequestBody SubStockRequest subStockRequest){
//        return StockService.subStock(subStockRequest.getId(),subStockRequest,subStockRequest.getAmount());
//    }

    @PostMapping(value = "/subStock/response")
    public StockResponse subStockResponse(@RequestBody SubStockRequest subStockRequest){
        return StockService.subStock(subStockRequest.getId(),subStockRequest,subStockRequest.getAmount());
    }
}
