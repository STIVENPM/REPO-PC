package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.TeacherDto;
import com.sena.crudbasic.model.Teacher;

public interface TeacherService {

    List<Teacher> findAll();
    Teacher findById(int id);
    String save(TeacherDto teacherDto);
    String delete(int id);
}
