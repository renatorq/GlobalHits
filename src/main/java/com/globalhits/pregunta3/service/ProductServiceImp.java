package com.globalhits.pregunta3.service;

import com.globalhits.pregunta3.entity.Product;
import com.globalhits.pregunta3.repository.ProductRepository;
import com.globalhits.pregunta3.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> listProductList() {
        return productRepository.findAll();
    }
}
