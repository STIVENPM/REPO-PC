package com.sena.crudbasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.TeacherCourseDto;
import com.sena.crudbasic.service.TeacherCourseService;

@RestController
@RequestMapping("/teacher-courses")
public class TeacherCourseController {

    @Autowired
    private TeacherCourseService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody TeacherCourseDto dto) {
        service.save(dto);
        return new ResponseEntity<>("Se guardó teacher_course", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Se eliminó teacher_course", HttpStatus.OK);
    }
}
