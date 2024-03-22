package com.qa.project.presentation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.qa.project.business.SellerService;
import com.qa.project.persistence.domain.SellerDomain;
import com.qa.project.business.dto.SellerDTO;

@RestController
@RequestMapping("/seller")
public class SellerController {
    private SellerService service;

    @Autowired
    public SellerController(SellerService service) {
        super();
        this.service = service;
    }

    // CRUD

    // CREATE Mapping
    @PostMapping
    public ResponseEntity<SellerDTO> create(@RequestBody SellerDomain model) {
        return new ResponseEntity<>(this.service.create(model), HttpStatus.CREATED);
    }

    // READ Mapping
    @GetMapping
    public ResponseEntity<List<SellerDTO>> readAll() {
        return ResponseEntity.ok(this.service.readAll());
    }

    // READ Mapping by ID
    @GetMapping("/{id}")
    public ResponseEntity<SellerDTO> readOne(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.readOne(id));
    }

    // UPDATE Mapping
    @PutMapping("/{id}")
    public ResponseEntity<SellerDTO> update(@PathVariable Long id, @RequestBody SellerDomain model) {
        return new ResponseEntity<>(this.service.update(id, model), HttpStatus.ACCEPTED);
    }

    // DELETE Mapping
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        return new ResponseEntity<>(this.service.delete(id) ? HttpStatus.NO_CONTENT : HttpStatus.INTERNAL_SERVER_ERROR);
    }
}




//
//
//
//    @GetMapping("/getAll")
//    public List<SellerDomain> getAll() {
//        return this.service.getAll();
//    }
//
//    @GetMapping("/get/{id}")
//    public SellerDomain getById(@PathVariable Integer id) {
//        return this.service.getById(id);
//    }
//
//    @PostMapping("/create")
//    public SellerDomain creatSellerDomain(@RequestBody SellerDomain sellerDomain) {
//        return this.service.createSellerDomain(sellerDomain);
//    }
//
//    @DeleteMapping("/remove/{id}")
//    public SellerDomain removeSellerDomain(@PathVariable int id) {
//        return this.service.removeSellerDomain(id);
//    }
//
//    @PatchMapping("/update/{id}")
//    public SellerDomain updateSellerDomain(@PathVariable Integer id,
//                                           @RequestParam(required = false) String firstName,
//                                           @RequestParam(required = false) String surname,
//                                           @RequestParam(required = false) String email,
//                                           @RequestParam(required = false) String telephone) {
//        return this.service.updateSellerDomain(id, firstName, surname, email, telephone);
//    }
//}