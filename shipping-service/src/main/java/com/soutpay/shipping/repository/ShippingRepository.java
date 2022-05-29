package com.soutpay.shipping.repository;

import com.soutpay.shipping.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
