package com.qa.project.presentation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.qa.project.business.BookingService;
import com.qa.project.persistence.domain.BookingDomain;
import com.qa.project.business.dto.BookingDTO;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private BookingService service;

    @Autowired
    public BookingController(BookingService service) {
        super();
        this.service = service;
    }

    // READ Mapping
	@GetMapping
	public ResponseEntity<List<BookingDTO>> readAll() {
		return ResponseEntity.ok(this.service.readAll());
	}

    // READ Mapping by ID
	@GetMapping("/{id}")
	public ResponseEntity<BookingDTO> readOne(@PathVariable Long id) {
		return ResponseEntity.ok(this.service.readOne(id));
	}

    // CREATE Mapping
	@PostMapping
	public ResponseEntity<BookingDTO> create(@RequestBody BookingDomain model) {
		return new ResponseEntity<>(this.service.create(model), HttpStatus.CREATED);
	}

	// UPDATE Mapping
	@PutMapping("/{id}")
	public ResponseEntity<BookingDTO> update(@PathVariable Long id, @RequestBody BookingDomain model) {
		return new ResponseEntity<>(this.service.update(id, model), HttpStatus.ACCEPTED);
	}

	// DELETE Mapping
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		return new ResponseEntity<>(this.service.delete(id) ? HttpStatus.NO_CONTENT : HttpStatus.INTERNAL_SERVER_ERROR);
	}
}