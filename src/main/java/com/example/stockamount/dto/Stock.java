package com.example.stockamount.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Stock {
    private long id;
    private String name;
    private int remainingAmount;
}
