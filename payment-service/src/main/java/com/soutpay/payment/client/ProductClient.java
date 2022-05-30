package com.soutpay.payment.client;

import com.soutpay.payment.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name = "localhost:8091/inventory-servce", path = "/products")
// sin load balancer
@FeignClient(name = "inventory-servce", url = "localhost:8091", path = "/products", fallback = ProductHystrixFallbackFactory.class)
public interface ProductClient {

    @GetMapping("/{id}")
    ResponseEntity<Product> getProductById(@PathVariable Long id);
}
