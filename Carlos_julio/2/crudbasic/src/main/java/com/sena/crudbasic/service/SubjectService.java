package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.SubjectDto;
import com.sena.crudbasic.model.Subject;

public interface SubjectService {

    List<Subject> findAll();
    Subject findById(int id);
    String save(SubjectDto dto);
    String delete(int id);
}
