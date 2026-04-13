package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.StudentSubjectDto;
import com.sena.crudbasic.model.StudentSubject;

public interface StudentSubjectService {

    List<StudentSubject> findAll();
    StudentSubject findById(int id);
    String save(StudentSubjectDto dto);
    String delete(int id);
}
