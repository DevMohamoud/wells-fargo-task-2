package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;


@Entity
public class Security {

    @Id
    @Column(nullable = false)
    private long securityId;

    @ManyToOne
    @GeneratedValue()
    @Column()
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }
    public Security(Portfolio portfolio, String name, String category, Double purchasePrice, LocalDate purchaseDate, long quantity) {
        this.portfolio = portfolio;
        this.name      = name;
        this.category  = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate  = purchaseDate;
        this.quantity      = quantity;
    }

    public long getSecurityId() {
        return securityId;
    };

    public Portfolio getPortfolio() {
        return portfolio;
    };

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    };

    public String getName() {
        return name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public String getCategory() {
        return category;
    };

    public void setCategory(String category) {
        this.category = category;
    };

    public Double getPurchasePrice() {
        return purchasePrice;
    };

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    };

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    };

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    };

    public long getQuantity() {
        return quantity;
    };

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
