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

import com.qa.project.business.BuyerService;
import com.qa.project.persistence.domain.BuyerDomain;

@RestController
public class BuyerController {
    private BuyerService service;

    public BuyerController(BuyerService service) {
        this.service = service;
    }

    @SuppressWarnings("unused")
    private List<BuyerDomain> buyerDomains = new ArrayList<>();

    @GetMapping("/getAllBuyers")
    public List<BuyerDomain> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/getBuyers/{id}")
    public BuyerDomain getById(@PathVariable Integer id) {
        return this.service.getById(id);
    }

    @PostMapping("/createBuyers")
    public BuyerDomain createBuyerDomain(@RequestBody BuyerDomain buyerDomain) {
        return this.service.createBuyerDomain(buyerDomain);
    }

    @DeleteMapping("/removeBuyers/{id}") 
    public BuyerDomain removeBuyerDomain(@PathVariable int id) {
        return this.service.removeBuyerDomain(id);
    }

    @PatchMapping("/updateBuyers/{id}")
    public BuyerDomain updateBuyerDomain(@PathVariable Integer id,
                                           @RequestParam(required = false) String firstName, 
                                           @RequestParam(required = false) String surname) {
        return this.service.updateBuyerDomain(id, firstName, surname);
    }
}