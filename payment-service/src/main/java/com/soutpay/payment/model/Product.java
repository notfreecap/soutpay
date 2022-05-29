package com.soutpay.payment.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {

    private Long id;
    private UUID code;
    private String name;
    private Integer stock;
    private Double price;
    private String state;
    private Long storageCellarId;


}
