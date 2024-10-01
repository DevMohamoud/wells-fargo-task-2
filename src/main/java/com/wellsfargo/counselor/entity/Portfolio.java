package com.wellsfargo.counselor.entity;

import org.apache.poi.ss.formula.functions.Columns;
import org.hibernate.annotations.ManyToAny;

//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Id
    @GeneratedValue()
    private long clientId;


    @ManyToOne
    @Column(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    protected Portfolio() {

    }
    public Portfolio(Client client, LocalDateTime createdAt) {
        this.client = client;
        this.createdAt = createdAt;

    };
    public long getPortfolio() {
        return portfolioId;
    };

    public long getClientId() {
        return clientId;
    }
}
