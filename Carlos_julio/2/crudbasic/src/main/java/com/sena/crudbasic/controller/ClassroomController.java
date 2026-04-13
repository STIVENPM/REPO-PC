package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.ClassroomDto;
import com.sena.crudbasic.model.Classroom;
import com.sena.crudbasic.service.ClassroomService;

@RestController
@RequestMapping("/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<Classroom> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Classroom c = service.findById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @GetMapping("filterbynumber/{number}")
    public ResponseEntity<Object> filterByNumber(@PathVariable String number) {
        List<Classroom> list = service.filterByNumber(number);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody ClassroomDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó el classroom", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó el classroom", HttpStatus.OK);
    }
}
