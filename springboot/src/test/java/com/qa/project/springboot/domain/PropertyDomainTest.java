package com.qa.project.springboot.domain;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.domain.PropertyDomain;
import com.qa.project.persistence.domain.SellerDomain;
import com.qa.project.persistence.enums.StatusEnum;
import com.qa.project.persistence.enums.TypeEnum;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class PropertyDomainTest {

    @Mock
    private SellerDomain mockSeller;
    @Mock
    private BuyerDomain mockBuyer;

    private PropertyDomain property;
    private PropertyDomain propertyWithBuyer;
    private Long id = 1L;
    private StatusEnum status = StatusEnum.FORSALE;
    private String address1 = "1 Main";
    private String address2 = "Street";
    private String city = "Manchester";
    private String county = "";

    private String postcode = "M1";

    private Integer price = 150000;

    private TypeEnum type = TypeEnum.APARTMENT;

    private Integer bedrooms = 1;

    @BeforeEach
    public void setUp() {
        property = new PropertyDomain(id, status, address1, address2, city, county, postcode, price, type, bedrooms, mockSeller, mockBuyer);
        propertyWithBuyer = new PropertyDomain(id, status, address1, address2, city, county, postcode, price, type, bedrooms, mockSeller, mockBuyer);
    }

    @Test
    public void testDefaultConstructor() {
        PropertyDomain defaultProperty = new PropertyDomain();
        assertNotNull(defaultProperty);
    }

    @Test
    public void testNoBuyerConstructor() {
        assertNotNull(property);
        assertEquals(id, property.getId());
        assertEquals(status, property.getStatus());
        assertEquals(address1, property.getAddress1());
        assertEquals(address2, property.getAddress2());
        assertEquals(city, property.getCity());
        assertEquals(county, property.getCounty());
        assertEquals(postcode, property.getPostcode());
        assertEquals(price, property.getPrice());
        assertEquals(type, property.getType());
        assertEquals(bedrooms, property.getBedrooms());
        assertEquals(mockSeller, property.getSeller());
        assertEquals(mockBuyer, property.getBuyer());
    }

    @Test
    public void testAllArgumentsConstructor() {
        assertNotNull(propertyWithBuyer);
        assertEquals(id, propertyWithBuyer.getId());
        assertEquals(status, propertyWithBuyer.getStatus());
        assertEquals(address1, propertyWithBuyer.getAddress1());
        assertEquals(address2, propertyWithBuyer.getAddress2());
        assertEquals(city, propertyWithBuyer.getCity());
        assertEquals(county, propertyWithBuyer.getCounty());
        assertEquals(postcode, propertyWithBuyer.getPostcode());
        assertEquals(price, propertyWithBuyer.getPrice());
        assertEquals(type, propertyWithBuyer.getType());
        assertEquals(bedrooms, propertyWithBuyer.getBedrooms());
        assertEquals(mockSeller, propertyWithBuyer.getSeller());
        assertEquals(mockBuyer, propertyWithBuyer.getBuyer());
    }

    @Test
    public void testGetId() {
        assertEquals(id, property.getId());
    }

    @Test
    public void testGetStatus() {
        assertEquals(status, propertyWithBuyer.getStatus());
    }

    @Test
    public void testGetAddress1() {
        assertEquals(address1, propertyWithBuyer.getAddress1());
    }

    @Test
    public void testGetAddress2() {
        assertEquals(address2, propertyWithBuyer.getAddress2());
    }

    @Test
    public void testGetCity() {
        assertEquals(city, propertyWithBuyer.getCity());
    }

    @Test
    public void testGetCounty() {
        assertEquals(county, propertyWithBuyer.getCounty());
    }

    @Test
    public void testGetPostcode() {
        assertEquals(postcode, propertyWithBuyer.getPostcode());
    }

    @Test
    public void testGetPrice() {
        assertEquals(price, propertyWithBuyer.getPrice());
    }

    @Test
    public void testGetType() {
        assertEquals(type, propertyWithBuyer.getType());
    }

    @Test
    public void testGetBedrooms() {
        assertEquals(bedrooms, propertyWithBuyer.getBedrooms());
    }

    @Test
    public void testGetSeller() {
        assertEquals(mockSeller, propertyWithBuyer.getSeller());
    }

    @Test
    public void testGetBuyer() {
        assertEquals(mockBuyer, propertyWithBuyer.getBuyer());
    }

    @Test
    public void testSetId() {

    }
}