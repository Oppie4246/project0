package com.qa.project.persistence.domain;

import jakarta.persistence.Entity;

import java.util.List;


@Entity
public class BuyerDomain {

    private String Fname;

    private String Surname;

    private Integer age;

    private String Email;

    private Double Telephone;

    public String getFname() {
        return Fname;
    }
}