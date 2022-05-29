package com.soutpay.payment.controller;

import com.soutpay.payment.entity.Payment;
import com.soutpay.payment.service.Impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentServiceImpl paymentService;


    @GetMapping
    public ResponseEntity<List<Payment>> getAllPayments(){
        log.info("PaymentController - getAllPayments");
        return new ResponseEntity<>(paymentService.getAllPayments(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentByid(@PathVariable Long id){
        log.info("Looking fo payment {}", id);
        return new ResponseEntity<>(paymentService.findByIdPayment(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Payment> savePayment(Payment payment){
        log.info("Creating Payment : {}", payment);
        return new ResponseEntity<>(paymentService.savePayment(payment), HttpStatus.CREATED);
    }

}
