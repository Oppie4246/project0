package com.qa.project.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.repo.BuyerRepo;

@Service
public class BuyerService {
    
    private BuyerRepo repo;

    public BuyerService(BuyerRepo repo) {
        this.repo = repo;
    }

    @SuppressWarnings("null")
    public BuyerDomain getById(Integer id) {
        return this.repo.findById(id).get();
    }

    public List<BuyerDomain> getAll() {
        return this.repo.findAll();
    }

    @SuppressWarnings("null")
    public BuyerDomain createBuyerDomain(BuyerDomain buyerDomain) {
        return this.repo.save(buyerDomain);
    }

    public BuyerDomain removeBuyerDomain(int id) {
        BuyerDomain removed = this.getById(id);
        this.repo.deleteById(id);
        return removed;
    }

    @SuppressWarnings("null")
    public BuyerDomain updateBuyerDomain(Integer id, String firstName, String surname) {
        BuyerDomain toUpdate = this.getById(id);

        if(firstName != null) {
            toUpdate.setFirstName(firstName);
        }
        if(surname != null) {
            toUpdate.setSurname(surname);
        }

        return this.repo.save(toUpdate);
    }
}