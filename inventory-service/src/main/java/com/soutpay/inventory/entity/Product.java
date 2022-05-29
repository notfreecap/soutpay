package com.soutpay.inventory.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(generator = "UUID")
    private UUID code;

    private String name;

    private Integer stock;

    private Double price;

    private String state;

    @Column(name = "storage_cellar_id")
    private Long storageCellarId;


}
