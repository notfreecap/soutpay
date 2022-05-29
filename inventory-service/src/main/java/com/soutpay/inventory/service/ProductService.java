package com.soutpay.inventory.service;

import com.soutpay.inventory.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product findByIdProduct(Long id);

    Product saveProduct(Product product);

    Product updateProduct(Product product);

    Product deleteProduct(Product product);

}
