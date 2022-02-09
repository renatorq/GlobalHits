package com.globalhits.pregunta3.controller;

import com.globalhits.pregunta3.service.SaleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Sales/v1")
public class SaleController {

    @Autowired
    private SaleServiceImp saleServiceImp;

    @GetMapping(value = "/computingSale")
    private ResponseEntity<Double> computingSale (@RequestParam Long idProduct,@RequestParam Long amount){
        return ResponseEntity.status(HttpStatus.OK).body(saleServiceImp.computingSale(idProduct, amount));
    }

}