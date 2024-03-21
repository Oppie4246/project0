package com.qa.project.business;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.project.persistence.domain.PropertyDomain;
import com.qa.project.business.dto.PropertyDTO;
import com.qa.project.persistence.repo.PropertyRepo;

@Service
public class PropertyService {

    private PropertyRepo repo;
    private ModelMapper mapper;

    @Autowired
    public PropertyService(PropertyRepo repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private PropertyDTO mapToDto(PropertyDomain model) {
        return this.mapper.map(model, PropertyDTO.class);
    }

    public PropertyDTO create(PropertyDomain model) {
        return this.mapToDto(this.repo.save(model));
    }

    public List<PropertyDTO> readAll() {
        return this.repo.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public PropertyDTO readOne(Long id) {
        return this.mapToDto(this.repo.findById(id).orElseThrow());
    }

    public PropertyDTO update(Long id, PropertyDomain model) {

        PropertyDomain existing = this.repo.findById(id).orElseThrow();

        existing.setId(model.getId());
        existing.setStatus(model.getStatus());
        existing.setAddress1(model.getAddress1());
        existing.setAddress2(model.getAddress2());
        existing.setCity(model.getCity());
        existing.setCounty(model.getCounty());
        existing.setPostcode(model.getPostcode());
        existing.setPrice(model.getPrice());
        existing.setType(model.getType());
        existing.setBedrooms(model.getBedrooms());
        existing.setSeller(model.getSeller());
        existing.setBuyer(model.getBuyer());

        return this.mapToDto(this.repo.save(existing));
    }

    public boolean delete(Long id) {
        this.repo.deleteById(id);
        return !this.repo.existsById(id);
    }
}