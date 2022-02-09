package com.globalhits.pregunta3.service;

import com.globalhits.pregunta3.entity.Product;
import com.globalhits.pregunta3.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImp implements ISaleService{

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private IProductService productService;

    @Override
    public double computingSale(Long idProduct, Long amount) {
        Product product = productService.getProduct(idProduct);
        double salePrice = (amount>=6)? product.getWholesale_price(): product.getPrice();
        return salePrice * amount;
    }
}
