package com.globalhits.pregunta3.controller;

import com.globalhits.pregunta3.entity.Product;
import com.globalhits.pregunta3.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RestController
@RequestMapping(value = "/Sales/v1")
public class SaleController {

    @Autowired
    private SaleServiceImp saleServiceImp;
    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping(value = "/computingSale")
    private ResponseEntity<Double> computingSale (@RequestParam Long idProduct,@RequestParam Long amount){
        return ResponseEntity.status(HttpStatus.OK).body(saleServiceImp.computingSale(idProduct, amount));
    }

}
