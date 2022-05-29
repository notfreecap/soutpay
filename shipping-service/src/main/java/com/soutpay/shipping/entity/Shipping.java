package com.soutpay.shipping.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(generator = "UUID")
    @Column(name = "code", nullable = false, updatable = false)
    private UUID code;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    private String address;

    @Column(name = "send_at")
    private LocalDateTime sendAt;

    @Column(name = "estimated_arrive")
    private String estimatedArrive;

    private String status;
}
