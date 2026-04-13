package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.ActivityDto;
import com.sena.crudbasic.model.Activity;
import com.sena.crudbasic.service.ActivityService;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityService service;

    // GET /activities
    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<Activity> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // GET /activities/{id}
    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Activity a = service.findById(id);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    // GET /activities/filterbyname/{name}
    @GetMapping("filterbyname/{name}")
    public ResponseEntity<Object> filterByName(@PathVariable String name) {
        List<Activity> list = service.filterByName(name);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // POST /activities
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody ActivityDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó la actividad", HttpStatus.OK);
    }

    // DELETE /activities/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó la actividad", HttpStatus.OK);
    }
}
