package com.soutpay.shipping.service.Impl;

import com.soutpay.shipping.entity.Shipping;
import com.soutpay.shipping.repository.ShippingRepository;
import com.soutpay.shipping.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingServiceImpl implements ShippingService {

    @Autowired
    ShippingRepository shippingRepository;

    @Override
    public List<Shipping> getAll() {
        return shippingRepository.findAll();
    }

    @Override
    public Shipping saveShipping(Shipping shipping) {
        return shippingRepository.save(shipping);
    }

    @Override
    public Shipping updateShipping(Shipping shipping) {
        return shippingRepository.save(shipping);
    }

    @Override
    public Shipping deleteShipping(Shipping shipping) {
        return shippingRepository.save(shipping);
    }
}
