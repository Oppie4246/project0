package com.qa.project.presentation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.qa.project.business.BuyerService;
import com.qa.project.persistence.domain.BuyerDomain;
import com.qa.project.business.dto.BuyerDTO;

@RestController
@RequestMapping("/buyer")
public class BuyerController {
    private BuyerService service;

    @Autowired
    public BuyerController(BuyerService service) {
        super();
        this.service = service;
    }

    // CRUD

    // CREATE Mapping
    @PostMapping
    public ResponseEntity<BuyerDTO> create(@RequestBody BuyerDomain model) {
        return new ResponseEntity<>(this.service.create(model), HttpStatus.CREATED);
    }

    // READ Mapping
    @GetMapping
    public ResponseEntity<List<BuyerDTO>> readAll() {
        return ResponseEntity.ok(this.service.readAll());
    }

    // READ Mapping by ID
    @GetMapping("/{id}")
    public ResponseEntity<BuyerDTO> readOne(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.readOne(id));
    }

    // UPDATE Mapping
    @PutMapping("/{id}")
    public ResponseEntity<BuyerDTO> update(@PathVariable Long id, @RequestBody BuyerDomain model) {
        return new ResponseEntity<>(this.service.update(id, model), HttpStatus.ACCEPTED);
    }

    // DELETE Mapping
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        return new ResponseEntity<>(this.service.delete(id) ? HttpStatus.NO_CONTENT : HttpStatus.INTERNAL_SERVER_ERROR);
    }
}











