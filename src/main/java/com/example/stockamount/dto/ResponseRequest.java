package com.example.stockamount.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ResponseRequest {

    private int amount;
    private Object response;
}
