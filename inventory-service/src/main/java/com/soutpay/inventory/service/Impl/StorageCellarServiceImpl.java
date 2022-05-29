package com.soutpay.inventory.service.Impl;

import com.soutpay.inventory.entity.StorageCellar;
import com.soutpay.inventory.repository.StorageCellarRepository;
import com.soutpay.inventory.service.StorageCellarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StorageCellarServiceImpl implements StorageCellarService {

    @Autowired
    StorageCellarRepository storageCellarRepository;

    @Override
    public List<StorageCellar> getAllStorageCellar() {
        return storageCellarRepository.findAll();
    }

    @Override
    public StorageCellar saveStorageCellar(StorageCellar storageCellar) {
        /*Optional<StorageCellar> storageCellarDB = storageCellarService.findById(storageCellar.getId());
        return storageCellarDB.orElseGet(() -> storageCellarRepository.save(storageCellar));*/
        return null;
    }

    @Override
    public StorageCellar updateStorageCellar(StorageCellar storageCellar) {
        return null;
    }

    @Override
    public Optional<StorageCellar> findById(StorageCellar storageCellar) {
        return Optional.empty();
    }

    @Override
    public StorageCellar deleteStorageCellar(StorageCellar storageCellar) {
        return null;
    }
}
