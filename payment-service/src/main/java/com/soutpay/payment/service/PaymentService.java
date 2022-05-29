package com.soutpay.payment.service;

import com.soutpay.payment.entity.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> getAllPayments();

    Payment getPayment(Payment payment);

    Payment savePayment(Payment payment);

    Payment updatePayment(Payment payment);

    Payment deletePayment(Payment payment);

}
