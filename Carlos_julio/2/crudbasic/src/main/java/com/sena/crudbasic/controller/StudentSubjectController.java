package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.StudentSubjectDto;
import com.sena.crudbasic.model.StudentSubject;
import com.sena.crudbasic.service.StudentSubjectService;

@RestController
@RequestMapping("/student-subjects")
public class StudentSubjectController {

    @Autowired
    private StudentSubjectService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<StudentSubject> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        StudentSubject ss = service.findById(id);
        return new ResponseEntity<>(ss, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody StudentSubjectDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó StudentSubject", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó StudentSubject", HttpStatus.OK);
    }
}
