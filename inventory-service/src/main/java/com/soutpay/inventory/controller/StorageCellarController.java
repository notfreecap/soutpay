package com.soutpay.inventory.controller;

import com.soutpay.inventory.entity.StorageCellar;
import com.soutpay.inventory.service.Impl.StorageCellarServiceImpl;
import com.soutpay.inventory.service.StorageCellarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/storagecellar")
public class StorageCellarController {

    @Autowired
    private StorageCellarServiceImpl storageCellarService;

    @GetMapping
    public ResponseEntity<List<StorageCellar>> getAllStorageCellar(){
        return new ResponseEntity<>(storageCellarService.getAllStorageCellar(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<StorageCellar> saveStorageCellar(StorageCellar storageCellar){
        return new ResponseEntity<>(storageCellarService.saveStorageCellar(storageCellar), HttpStatus.CREATED);
    }


}
