package com.globalhits.pregunta3.controller;

import com.globalhits.pregunta3.entity.Product;
import com.globalhits.pregunta3.service.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Products/v1")
public class ProductController {

    @Autowired
    private ProductServiceImp productServiceImp;
    @CrossOrigin(origins = "*",methods = {RequestMethod.POST})
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Product productCreate= productServiceImp.createProduct(product);
        return  ResponseEntity.ok(productCreate);
    }
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping
    public ResponseEntity<List<Product>> listProduct(){
        List<Product> listProducts = productServiceImp.listProductList();
        return ResponseEntity.ok(listProducts);
    }

}
