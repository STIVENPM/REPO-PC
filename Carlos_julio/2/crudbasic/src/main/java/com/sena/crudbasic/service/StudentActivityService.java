package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.StudentActivityDto;
import com.sena.crudbasic.model.StudentActivity;

public interface StudentActivityService {

    List<StudentActivity> findAll();
    StudentActivity findById(int id);
    String save(StudentActivityDto dto);
    String delete(int id);
}
