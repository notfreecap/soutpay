package com.soutpay.payment.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Shipping {

    private Long id;
    private UUID code;
    private LocalDateTime createdAt;
    private String address;
    private LocalDateTime sendAt;
    private String estimatedArrive;
    private String status;
}
