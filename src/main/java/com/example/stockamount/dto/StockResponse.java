package com.example.stockamount.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockResponse {
    private String status;
    private String message;
    private Stock stock;
}
