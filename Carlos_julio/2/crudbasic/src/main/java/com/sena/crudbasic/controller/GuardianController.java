package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.GuardianDto;
import com.sena.crudbasic.model.Guardian;
import com.sena.crudbasic.service.GuardianService;

@RestController
@RequestMapping("/guardians")
public class GuardianController {

    @Autowired
    private GuardianService service;

    // GET /guardians
    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<Guardian> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // GET /guardians/{id}
    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Guardian g = service.findById(id);
        return new ResponseEntity<>(g, HttpStatus.OK);
    }

    // POST /guardians
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody GuardianDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó el guardian", HttpStatus.OK);
    }

    // DELETE /guardians/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó el guardian", HttpStatus.OK);
    }
}
