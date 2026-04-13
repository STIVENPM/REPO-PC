package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.StudentDto;
import com.sena.crudbasic.model.Student;

public interface StudentService {

    List<Student> findAll();
    Student findById(int id);
    String save(StudentDto studentDto);
    String delete(int id);
}
