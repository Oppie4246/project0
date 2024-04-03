package com.qa.project.presentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.project.business.PropertyService;
import com.qa.project.persistence.domain.PropertyDomain;

@RestController
public class PropertyController {
    private PropertyService service;

    public PropertyController(PropertyService service) {
        this.service = service;
    }

    @SuppressWarnings("unused")
    private List<PropertyDomain> propertyDomains = new ArrayList<>();

    @GetMapping("/getAllProperties")
    public List<PropertyDomain> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/getProperties/{id}")
    public PropertyDomain getById(@PathVariable Integer id) {
        return this.service.getById(id);
    }

    @PostMapping("/createProperties")
    public PropertyDomain createPropertyDomain(@RequestBody PropertyDomain propertyDomain) {
        return this.service.createPropertyDomain(propertyDomain);
    }

    @DeleteMapping("/removeProperties/{id}") 
    public PropertyDomain removePropertyDomain(@PathVariable int id) {
        return this.service.removePropertyDomain(id);
    }

    @PatchMapping("/updateProperties/{id}")
    public PropertyDomain updatePropertyDomain(@PathVariable Integer id,
                                           @RequestParam(required = false) String status, 
                                           @RequestParam(required = false) String address1,
                                           @RequestParam(required = false) String address2, 
                                           @RequestParam(required = false) String city,
                                           @RequestParam(required = false) String county,
                                           @RequestParam(required = false) String postcode,
                                           @RequestParam(required = false) Integer price,
                                           @RequestParam(required = false) String type,
                                           @RequestParam(required = false) Integer bedrooms,
                                           @RequestParam(required = false) String details) {
        return this.service.updatePropertyDomain(id, status, address1, address2, city, county, postcode, price, type, bedrooms, details);
    }
}