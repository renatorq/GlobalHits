package com.globalhits.pregunta3.service;

import com.globalhits.pregunta3.entity.Product;

import java.util.List;

public interface IProductService {

    public Product createProduct (Product product);
    public Product getProduct (Long id);
    public List<Product> listProductList();

}
