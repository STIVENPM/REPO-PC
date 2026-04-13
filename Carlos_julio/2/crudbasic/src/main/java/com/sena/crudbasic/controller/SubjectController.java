package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.SubjectDto;
import com.sena.crudbasic.model.Subject;
import com.sena.crudbasic.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService service;

    // GET /subjects
    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<Subject> subjects = service.findAll();
        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }

    // GET /subjects/{id}
    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Subject s = service.findById(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    // POST /subjects
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody SubjectDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó la materia", HttpStatus.OK);
    }

    // DELETE /subjects/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó la materia", HttpStatus.OK);
    }
}
