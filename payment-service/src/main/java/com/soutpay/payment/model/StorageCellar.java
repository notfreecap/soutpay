package com.soutpay.payment.model;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class StorageCellar {

    private Long id;
    private UUID code;
    private String name;
    private String address;
    private Boolean isActive;
    private String state;
    private List<Product> products;

}
