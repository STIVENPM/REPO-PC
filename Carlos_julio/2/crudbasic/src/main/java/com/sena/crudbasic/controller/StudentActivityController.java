package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.StudentActivityDto;
import com.sena.crudbasic.model.StudentActivity;
import com.sena.crudbasic.service.StudentActivityService;

@RestController
@RequestMapping("/student-activities")
public class StudentActivityController {

    @Autowired
    private StudentActivityService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<StudentActivity> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        StudentActivity sa = service.findById(id);
        return new ResponseEntity<>(sa, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody StudentActivityDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó StudentActivity", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó StudentActivity", HttpStatus.OK);
    }
}
