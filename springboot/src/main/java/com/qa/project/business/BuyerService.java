package com.qa.project.business;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.repo.BuyerRepo;

import java.util.List;

public class BuyerService {

    private BuyerRepo repo;

    public BuyerService(BuyerRepo repo){
        this.repo = repo;
    }


    public List<BuyerDomain> getAll() {return this.buyer;}
}