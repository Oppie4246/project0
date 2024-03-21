package com.qa.project.persistence.domain;

import com.qa.project.persistence.enums.StatusEnum;
import com.qa.project.persistence.enums.TypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "property")
public class PropertyDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id")
    private Long id;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "city")
    private String city;

    @Column(name = "county")
    private String county;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "price")
    private Integer price;

    @Column(name = "bedrooms")
    private Integer bedrooms;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TypeEnum type;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @ManyToOne()
    @JoinColumn(name = "seller_id")
    private SellerDomain seller;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private BuyerDomain buyer;

    public PropertyDomain() {
        super();
    }

    public PropertyDomain(Long id, StatusEnum status, String address1, String address2,
                          String city, String county, String postcode,
                          Integer price, TypeEnum type, Integer bedrooms, SellerDomain seller) {
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

    public PropertyDomain(Long id, StatusEnum status, String address1, String address2,
                          String city, String county, String postcode,
                          Integer price, TypeEnum type, Integer bedrooms, SellerDomain seller, BuyerDomain buyer) {
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

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
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