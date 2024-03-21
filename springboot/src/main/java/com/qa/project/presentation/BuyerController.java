package com.qa.project.presentation;


import com.qa.project.persistence.domain.BuyerDomain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BuyerController {


    private List<BuyerDomain> buyer = new ArrayList<>();


    @GetMapping("/getAll")
    public List<BuyerDomain> getAll() {
        return this.people;
    }
}