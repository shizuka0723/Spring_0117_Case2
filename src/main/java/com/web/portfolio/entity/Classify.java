package com.web.portfolio.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classify")
public class Classify implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "transaction")
    private Boolean transaction;

    public Classify() {
    }

    public Classify(String name, Boolean transaction) {
        this.name = name;
        this.transaction = transaction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTransaction() {
        return transaction;
    }

    public void setTransaction(Boolean transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Classify{" + "id=" + id + ", name=" + name + ", transaction=" + transaction + '}';
    }
    
    
}
