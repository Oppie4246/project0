package com.qa.project.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.project.persistence.domain.PropertyDomain;
import com.qa.project.persistence.repo.PropertyRepo;

@Service
public class PropertyService {
    
    private PropertyRepo repo;

    public PropertyService(PropertyRepo repo) {
        this.repo = repo;
    }

    @SuppressWarnings("null")
    public PropertyDomain getById(Integer id) {
        return this.repo.findById(id).get();
    }

    public List<PropertyDomain> getAll() {
        return this.repo.findAll();
    }

    @SuppressWarnings("null")
    public PropertyDomain createPropertyDomain(PropertyDomain propertyDomain) {
        return this.repo.save(propertyDomain);
    }

    public PropertyDomain removePropertyDomain(int id) {
        PropertyDomain removed = this.getById(id);
        this.repo.deleteById(id);
        return removed;
    }

    @SuppressWarnings("null")
    public PropertyDomain updatePropertyDomain(Integer id, String status, String address1, String address2, String city, String county, String postcode, Integer price, String type, Integer bedrooms, String details) {
        PropertyDomain toUpdate = this.getById(id);

        if(status != null) {
            toUpdate.setStatus(status);
        }
        if(address1 != null) {
            toUpdate.setAddress1(address1);
        }
        if(address2 != null) {
            toUpdate.setAddress2(address2);
        }
        if(city != null) {
            toUpdate.setCity(city);
        }
        if(county != null) {
            toUpdate.setCounty(county);
        }
        if(postcode != null) {
            toUpdate.setPostcode(postcode);
        }
        if(price != null) {
            toUpdate.setPrice(price);
        }
        if(type != null) {
            toUpdate.setType(type);
        }
        if(bedrooms != null) {
            toUpdate.setBedrooms(bedrooms);
        }
        if(details != null) {
            toUpdate.setDetails(details);
        }

        return this.repo.save(toUpdate);
    }
}
