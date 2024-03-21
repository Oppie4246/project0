package com.qa.project.business;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.project.persistence.domain.BookingDomain;
import com.qa.project.business.dto.BookingDTO;
import com.qa.project.persistence.repo.BookingRepo;

@Service
public class BookingService {
   
    private BookingRepo repo;
    private ModelMapper mapper;
   
    @Autowired
    public BookingService(BookingRepo repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private BookingDTO mapToDto(BookingDomain model) {
        return this.mapper.map(model, BookingDTO.class);
    }
       
    public BookingDTO create(BookingDomain model) {
        return this.mapToDto(this.repo.save(model));
    }
 
    public List<BookingDTO> readAll() {
        return this.repo.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public BookingDTO readOne(Long id) {
        return this.mapToDto(this.repo.findById(id).orElseThrow());
    }

    public BookingDTO update(Long id, BookingDomain model) {

        BookingDomain existing = this.repo.findById(id)
                .orElseThrow();

        existing.setBuyer(model.getBuyer());
        existing.setProperty(model.getProperty());
        existing.setTime(model.getTime());

        return this.mapToDto(this.repo.save(existing));
    }

    public boolean delete(Long id) {
        this.repo.deleteById(id);
        return !this.repo.existsById(id);
    }
}