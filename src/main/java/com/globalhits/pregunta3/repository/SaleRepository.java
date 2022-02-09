package com.globalhits.pregunta3.repository;

import com.globalhits.pregunta3.entity.Product;
import com.globalhits.pregunta3.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
