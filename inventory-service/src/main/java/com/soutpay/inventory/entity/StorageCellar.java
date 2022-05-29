package com.soutpay.inventory.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "storage_cellar")
public class StorageCellar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(generator = "UUID")
    @Column(name = "code", updatable = false, nullable = false)
    private UUID code;

    @Column(name = "name", nullable = false)
    private String name;

    private String address;

    @Column(name = "active")
    private Boolean isActive;

    private String state;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "storage_cellar_id")
    private List<Product> products;

}
