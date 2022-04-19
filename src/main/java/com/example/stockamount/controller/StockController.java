package com.example.stockamount.controller;

import com.example.stockamount.dto.Stock;
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

//    @PostMapping(value = "/subStock")
    @GetMapping(value = "/subStock")
    public Stock subStock(@RequestBody int remainingAmount){
    return StockService.subStock(remainingAmount);
    }
}
