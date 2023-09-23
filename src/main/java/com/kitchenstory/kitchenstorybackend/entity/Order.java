package com.kitchenstory.kitchenstorybackend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "amount")
    Double amount;

    public Order(Long id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Order(Double amount) {
        this.amount = amount;
    }

    public Order() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
