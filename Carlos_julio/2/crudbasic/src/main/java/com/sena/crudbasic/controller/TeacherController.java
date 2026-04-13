package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.TeacherDto;
import com.sena.crudbasic.model.Teacher;
import com.sena.crudbasic.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;

    // GET /teachers
    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<Teacher> teachers = service.findAll();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    // GET /teachers/{id}
    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Teacher t = service.findById(id);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }

    // POST /teachers
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody TeacherDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó el profesor", HttpStatus.OK);
    }

    // DELETE /teachers/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó el profesor", HttpStatus.OK);
    }
}
