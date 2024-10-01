package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
    
    @Id
    @GeneratedValue()   
    private long clientId;

    @Id
    @GeneratedValue() 
    private long advisorId;

    @Column(nullable = false)
    private Advisor Advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private long phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }
    public Client(Advisor advisor, String firstName, String lastName, String address, long phone, String email) {
        this.Advisor   = advisor;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.address   = address;
        this.phone     = phone;
        this.email     = email;
    }

    public long getClientId() {
        return clientId;
    };

    public long getAdvisorId() {
        return advisorId;
    };

    public String getFirstName() {
        return firstName;
    };

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    };

    public String getLastName() {
        return lastName;
    };

    public void setLastName(String lastName) {
        this.lastName = lastName;
    };

    public String getAddress() {
        return address;
    };

    public void setAddress(String address) {
        this.address = address;
    };

    public long getPhone() {
        return phone;
    };

    public void setPhone(long phone) {
        this.phone = phone;
    };

    public String getEmail() {
        return email;
    };

    public void setEmail(String email) {
        this.email = email;
    };
}
