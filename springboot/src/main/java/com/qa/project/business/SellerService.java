package com.qa.project.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.project.persistence.domain.SellerDomain;
import com.qa.project.persistence.repo.SellerRepo;

@Service
public class SellerService {
    
    private SellerRepo repo;

    public SellerService(SellerRepo repo) {
        this.repo = repo;
    }

    @SuppressWarnings("null")
    public SellerDomain getById(Integer id) {
        return this.repo.findById(id).get();
    }

    public List<SellerDomain> getAll() {
        return this.repo.findAll();
    }

    @SuppressWarnings("null")
    public SellerDomain createSellerDomain(SellerDomain sellerDomain) {
        return this.repo.save(sellerDomain);
    }

    public SellerDomain removeSellerDomain(int id) {
        SellerDomain removed = this.getById(id);
        this.repo.deleteById(id);
        return removed;
    }

    @SuppressWarnings("null")
    public SellerDomain updateSellerDomain(Integer id, String firstName, String surname, String email, String telephone) {
        SellerDomain toUpdate = this.getById(id);

        if(firstName != null) {
            toUpdate.setFirstName(firstName);
        }
        if(surname != null) {
            toUpdate.setSurname(surname);
        }
        if(email != null) { 
            toUpdate.setEmail(email);
        }
        if(telephone != null) {
            toUpdate.setTelephone(telephone);
        }

        return this.repo.save(toUpdate);
    }
}