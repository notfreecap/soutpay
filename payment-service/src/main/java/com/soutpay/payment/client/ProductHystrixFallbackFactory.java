package com.soutpay.payment.client;

import com.soutpay.payment.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient{

    @Override
    public ResponseEntity<Product> getProductById(Long id) {
        Product product = Product.builder()
                .name("none")
                .state("none").build();
        return ResponseEntity.ok(product);
    }
}
