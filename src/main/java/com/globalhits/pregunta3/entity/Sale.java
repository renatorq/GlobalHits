package com.globalhits.pregunta3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Sale {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProduct")
    @JsonIgnoreProperties({ "handler", "hibernateLazyInitializer" })
    private Product product;

    @Column(name = "amount")
    private int amount;

    @Column(name = "salePrice")
    private double salePrice;

    @Column(name = "total")
    private double total;

}
