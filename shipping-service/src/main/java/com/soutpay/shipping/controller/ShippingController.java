package com.soutpay.shipping.controller;

import com.soutpay.shipping.entity.Shipping;
import com.soutpay.shipping.service.Impl.ShippingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @Autowired
    ShippingServiceImpl shippingService;

    @GetMapping
    public ResponseEntity<List<Shipping>> getAll(){
        log.info("ShippingController - getAll");
        return new ResponseEntity<>(shippingService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Shipping> saveShipping(Shipping shipping){
        log.info("ShippingController - saveShipping {}", shipping);
        return new ResponseEntity<>(shippingService.saveShipping(shipping), HttpStatus.CREATED);
    }

}
