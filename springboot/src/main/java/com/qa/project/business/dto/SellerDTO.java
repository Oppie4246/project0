package com.qa.project.business.dto;

import jakarta.persistence.Id;

public class SellerDTO{

    @Id
    private Long id;
    private String firstName;
    private String surname;
    private String email;
    private String telephone;

    public SellerDTO() {
        super();
    }

    public SellerDTO(Long id, String firstName, String surname, String email, String telephone) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}