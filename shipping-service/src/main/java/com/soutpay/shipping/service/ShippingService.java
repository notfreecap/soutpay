package com.soutpay.shipping.service;

import com.soutpay.shipping.entity.Shipping;

import java.util.List;

public interface ShippingService {

    List<Shipping> getAll();

    Shipping saveShipping(Shipping shipping);

    Shipping updateShipping(Shipping shipping);

    Shipping deleteShipping(Shipping shipping);



}
