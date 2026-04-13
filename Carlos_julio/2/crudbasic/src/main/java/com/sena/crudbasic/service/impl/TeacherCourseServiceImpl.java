package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.TeacherCourseDto;
import com.sena.crudbasic.model.Course;
import com.sena.crudbasic.model.Teacher;
import com.sena.crudbasic.model.TeacherCourse;
import com.sena.crudbasic.repository.CourseRepository;
import com.sena.crudbasic.repository.TeacherCourseRepository;
import com.sena.crudbasic.repository.TeacherRepository;
import com.sena.crudbasic.service.TeacherCourseService;

@Service
public class TeacherCourseServiceImpl implements TeacherCourseService {

    @Autowired
    private TeacherCourseRepository teacherCourseRepo;

    @Autowired
    private TeacherRepository teacherRepo;

    @Autowired
    private CourseRepository courseRepo;

    // DTO -> Model
    private TeacherCourse dtoToModel(TeacherCourseDto dto) {
        TeacherCourse tc = new TeacherCourse();
        tc.setId(dto.getId());

        Teacher t = teacherRepo.findById(dto.getIdTeacher()).orElse(null);
        Course c = courseRepo.findById(dto.getIdCourse()).orElse(null);

        tc.setTeacher(t);
        tc.setCourse(c);

        return tc;
    }

    @Override
    public List<TeacherCourse> findAll() {
        return teacherCourseRepo.findAll();
    }

    @Override
    public TeacherCourse findById(int id) {
        return teacherCourseRepo.findById(id).orElse(null);
    }

    @Override
    public String save(TeacherCourseDto dto) {
        TeacherCourse tc = dtoToModel(dto);
        teacherCourseRepo.save(tc);
        return "OK";
    }

    @Override
    public String delete(int id) {
        teacherCourseRepo.deleteById(id);
        return "OK";
    }
}
