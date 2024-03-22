package com.qa.project.business;

import java.util.ArrayList;
import java.util.List;

import com.qa.project.persistence.repo.BuyerRepo;
import org.springframework.stereotype.Service;

import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.persistence.repo.BuyerRepo;

@Service
public class BuyerService {
    private BuyerRepo repo;
    private List<BuyerDomain> buyer = new ArrayList<>();

    public BuyerService(BuyerRepo repo) {
        this.repo = repo;
    }

    public BuyerDomain getById(Integer id) {
        return this.repo.findById(id).get();
    }

    public List<BuyerDomain> getAll() {
        return this.repo.findAll();
    }

    public BuyerDomain createBuyerDomain(BuyerDomain buyer) {
        return this.repo.save(buyer);
    }

    public BuyerDomain removeBuyerDomain(int id) {
        BuyerDomain removed = this.getById(id);
        this.repo.deleteById(id);
        return removed;
    }

    public BuyerDomain updateBuyerDomain(Integer id, String firstName, String surname, String email, String telephone) {
        BuyerDomain toUpdate = this.getById(id);

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