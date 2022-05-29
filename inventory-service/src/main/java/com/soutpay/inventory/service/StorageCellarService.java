package com.soutpay.inventory.service;

import com.soutpay.inventory.entity.StorageCellar;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StorageCellarService {

    List<StorageCellar> getAllStorageCellar();

    StorageCellar saveStorageCellar(StorageCellar storageCellar);

    StorageCellar updateStorageCellar(StorageCellar storageCellar);

    Optional<StorageCellar> findById(StorageCellar storageCellar);

    StorageCellar deleteStorageCellar(StorageCellar storageCellar);

}
