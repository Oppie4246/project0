package com.qa.project.business.dto;

import java.sql.Timestamp;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.PropertyDomain;


public class BookingDTO {

    private Long id;
    private BuyerDomain buyer;
    private PropertyDomain property;
    private Timestamp time;

    public BookingDTO() {
        super();
    }

    public BookingDTO(Long id, BuyerDomain buyer, PropertyDomain property, Timestamp time) {
        this.id = id;
        this.buyer = buyer;
        this.property = property;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BuyerDomain getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerDomain buyer) {
        this.buyer = buyer;
    }

    public PropertyDomain getProperty() {
        return property;
    }

    public void setProperty(PropertyDomain property) {
        this.property = property;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}


