package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.StudentDto;
import com.sena.crudbasic.model.Student;
import com.sena.crudbasic.service.StudentService;

@RestController
@RequestMapping("/students") // todas las rutas empiezan por /students
public class StudentController {

    @Autowired
    private StudentService service;

    // GET /students
    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        List<Student> students = service.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // GET /students/{id}
    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Student s = service.findById(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    // POST /students
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody StudentDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó el estudiante", HttpStatus.OK);
    }

    // DELETE /students/{id}
    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó el estudiante", HttpStatus.OK);
    }
}
