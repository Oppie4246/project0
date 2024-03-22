package com.qa.project.presentation;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.qa.project.business.SellerService;
import com.qa.project.persistence.domain.SellerDomain;

@RestController
@RequestMapping("/seller")
public class SellerController {
    private SellerService service;

    public SellerController(SellerService service) {
        super();
        this.service = service;
    }

    // private List<SellerDomain> sellerDomains = new ArrayList<>();

    @GetMapping("/getAll")
    public List<SellerDomain> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/get/{id}")
    public SellerDomain getById(@PathVariable Integer id) {
        return this.service.getById(id);
    }

    @PostMapping("/create")
    public SellerDomain creatSellerDomain(@RequestBody SellerDomain sellerDomain) {
        return this.service.createSellerDomain(sellerDomain);
    }

    @DeleteMapping("/remove/{id}") 
    public SellerDomain removeSellerDomain(@PathVariable int id) {
        return this.service.removeSellerDomain(id);
    }

    @PatchMapping("/update/{id}")
    public SellerDomain updateSellerDomain(@PathVariable Integer id,
                                           @RequestParam(required = false) String firstName, 
                                           @RequestParam(required = false) String surname,
                                           @RequestParam(required = false) String email, 
                                           @RequestParam(required = false) String telephone) {
        return this.service.updateSellerDomain(id, firstName, surname, email, telephone);
    }
}