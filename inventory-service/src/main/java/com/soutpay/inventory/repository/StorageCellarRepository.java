package com.soutpay.inventory.repository;

import com.soutpay.inventory.entity.StorageCellar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StorageCellarRepository extends JpaRepository<StorageCellar, Long> {
}
