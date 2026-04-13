package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.StudentActivityDto;
import com.sena.crudbasic.model.Activity;
import com.sena.crudbasic.model.Student;
import com.sena.crudbasic.model.StudentActivity;
import com.sena.crudbasic.repository.ActivityRepository;
import com.sena.crudbasic.repository.StudentActivityRepository;
import com.sena.crudbasic.repository.StudentRepository;
import com.sena.crudbasic.service.StudentActivityService;

@Service
public class StudentActivityServiceImpl implements StudentActivityService {

    @Autowired
    private StudentActivityRepository repo;

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private ActivityRepository activityRepo;

    // DTO -> Model
    private StudentActivity dtoToModel(StudentActivityDto dto) {

        StudentActivity sa = new StudentActivity();
        sa.setId(dto.getId());

        Student s = studentRepo.findById(dto.getIdStudent()).orElse(null);
        Activity a = activityRepo.findById(dto.getIdActivity()).orElse(null);

        sa.setStudent(s);
        sa.setActivity(a);

        return sa;
    }

    @Override
    public List<StudentActivity> findAll() {
        return repo.findAll();
    }

    @Override
    public StudentActivity findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String save(StudentActivityDto dto) {
        StudentActivity sa = dtoToModel(dto);
        repo.save(sa);
        return "OK";
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "OK";
    }
}
