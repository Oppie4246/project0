package com.qa.project.business;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.business.dto.BuyerDTO;
import com.qa.project.persistence.repo.BuyerRepo;

@Service
public class BuyerService {

    private BuyerRepo repo;
    private ModelMapper mapper;

    @Autowired
    public BuyerService(BuyerRepo repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private BuyerDTO mapToDto(BuyerDomain model) {
        return this.mapper.map(model, BuyerDTO.class);
    }

    public BuyerDTO create(BuyerDomain model) {
        return this.mapToDto(this.repo.save(model));
    }

    public List<BuyerDTO> readAll() {
        return this.repo.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public BuyerDTO readOne(Long id) {
        return this.mapToDto(this.repo.findById(id).orElseThrow());
    }

    public BuyerDTO update(Long id, BuyerDomain model) {

        BuyerDomain existing = this.repo.findById(id).orElseThrow();

        existing.setFirstName(model.getFirstName());
        existing.setSurname(model.getSurname());
        existing.setAddress(model.getAddress());
        existing.setPostcode(model.getPostcode());
        existing.setPhone(model.getPhone());

        return this.mapToDto(this.repo.save(existing));
    }

    public boolean delete(Long id) {
        this.repo.deleteById(id);
        return !this.repo.existsById(id);
    }
}
