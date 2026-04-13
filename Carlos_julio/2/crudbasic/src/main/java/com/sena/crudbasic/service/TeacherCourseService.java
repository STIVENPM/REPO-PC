package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.TeacherCourseDto;
import com.sena.crudbasic.model.TeacherCourse;

public interface TeacherCourseService {

    List<TeacherCourse> findAll();
    TeacherCourse findById(int id);
    String save(TeacherCourseDto dto);
    String delete(int id);
}
