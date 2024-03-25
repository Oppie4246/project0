package com.qa.project.business;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.project.persistence.domain.SellerDomain;
import com.qa.project.business.dto.SellerDTO;
import com.qa.project.persistence.repo.SellerRepo;

@Service
public class SellerService {

    private final SellerRepo repo;
    private final ModelMapper mapper;

    @Autowired
    public SellerService(SellerRepo repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private SellerDTO mapToDto(SellerDomain model) {
        return this.mapper.map(model, SellerDTO.class);
    }

    public SellerDTO create(SellerDomain model) {
        return this.mapToDto(this.repo.save(model));
    }

    public List<SellerDTO> readAll() {
        return this.repo.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public SellerDTO readOne(Long id) {
        return this.mapToDto(this.repo.findById(id).orElseThrow());
    }

    public SellerDTO update(Long id, SellerDomain model) {

        SellerDomain existing = this.repo.findById(id)
                .orElseThrow();

        existing.setFirstName(model.getFirstName());
        existing.setSurname(model.getSurname());
        existing.setEmail(model.getEmail());
        existing.setTelephone(model.getTelephone());

        return this.mapToDto(this.repo.save(existing));
    }

    public boolean delete(Long id) {
        this.repo.deleteById(id);
        return !this.repo.existsById(id);
    }
}