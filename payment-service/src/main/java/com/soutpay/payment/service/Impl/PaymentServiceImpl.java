package com.soutpay.payment.service.Impl;

import com.soutpay.payment.entity.Payment;
import com.soutpay.payment.repository.PaymentRepository;
import com.soutpay.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPayment(Payment payment) {
        return paymentRepository.findById(payment.getId()).orElse(null);
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment updatePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment deletePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
