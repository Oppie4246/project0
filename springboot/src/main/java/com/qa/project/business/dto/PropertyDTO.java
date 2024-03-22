package com.qa.project.business.dto;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.SellerDomain;
import com.qa.project.persistence.enums.StatusEnum;
import com.qa.project.persistence.enums.TypeEnum;

public class PropertyDTO {

    private Long id;
    private StatusEnum status;
    private String address1;
    private String address2;
    private String city;
    private String county;
    private String postcode;
    private Integer price;
    private TypeEnum type;
    private Integer bedrooms;
    private SellerDomain seller;
    private BuyerDomain buyer;

    public PropertyDTO() {
        super();
    }

    public PropertyDTO(Long id, StatusEnum status, String address1, String address2, String city, String county, String postcode, Integer price, TypeEnum type, Integer bedrooms, SellerDomain seller) {
        super();
        this.id = id;
        this.status = status;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
        this.price = price;
        this.type = type;
        this.bedrooms = bedrooms;
        this.seller = seller;
    }

    public PropertyDTO(Long id, StatusEnum status, String address1, String address2, String city, String county, String postcode, Integer price, TypeEnum type, Integer bedrooms, SellerDomain seller, BuyerDomain buyer) {
        super();
        this.id = id;
        this.status = status;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
        this.price = price;
        this.type = type;
        this.bedrooms = bedrooms;
        this.seller = seller;
        this.buyer = buyer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public SellerDomain getSeller() {
        return seller;
    }

    public void setSeller(SellerDomain seller) {
        this.seller = seller;
    }

    public BuyerDomain getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerDomain buyer) {
        this.buyer = buyer;
    }
}