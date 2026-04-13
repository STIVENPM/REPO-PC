package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.StudentDto;
import com.sena.crudbasic.model.Course;
import com.sena.crudbasic.model.Student;
import com.sena.crudbasic.repository.CourseRepository;
import com.sena.crudbasic.repository.StudentRepository;
import com.sena.crudbasic.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private CourseRepository courseRepo;

    // DTO -> Model
    private Student dtoToModel(StudentDto dto) {
        Student s = new Student();
        s.setId(dto.getId());
        s.setName(dto.getName());

        // buscamos el curso por id para relacionarlo
        Course c = courseRepo.findById(dto.getIdCourse()).orElse(null);
        s.setCourse(c);

        return s;
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public String save(StudentDto dto) {
        Student s = dtoToModel(dto);
        studentRepo.save(s);
        return "OK";
    }

    @Override
    public String delete(int id) {
        studentRepo.deleteById(id);
        return "OK";
    }
}
