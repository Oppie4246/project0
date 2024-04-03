package com.qa.project.persistence.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BuyerDomain {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String surname;

    public BuyerDomain(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }   
}