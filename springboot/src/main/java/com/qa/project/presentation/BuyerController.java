package com.qa.project.presentation;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.qa.project.business.BuyerService;
import com.qa.project.persistence.domain.BuyerDomain;

@RestController
@RequestMapping("buyer")
public class BuyerController {
    private BuyerService service;

    public BuyerController(BuyerService service) {
        super();
        this.service = service;
    }

    // private List<BuyerDomain> buyer = new ArrayList<>();

    @GetMapping("/getAll")
    public List<BuyerDomain> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/get/{id}")
    public BuyerDomain getById(@PathVariable Integer id) {
        return this.service.getById(id);
    }

    @PostMapping("/create")
    public BuyerDomain createBuyerDomain(@RequestBody BuyerDomain buyer) {
        return this.service.createBuyerDomain(buyer);
    }

    @DeleteMapping("/remove/{id}")
    public BuyerDomain removeBuyerDomain(@PathVariable int id) {
        return this.service.removeBuyerDomain(id);
    }

    @PatchMapping("/update/{id}")
    public BuyerDomain updateBuyerDomain(@PathVariable Integer id,
                                         @RequestParam(required = false) String firstName,
                                         @RequestParam(required = false) String surname,
                                         @RequestParam(required = false) String email,
                                         @RequestParam(required = false) String telephone) {
        return this.service.updateBuyerDomain(id, firstName, surname, email, telephone);
    }
}