package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.TeacherDto;
import com.sena.crudbasic.model.Teacher;
import com.sena.crudbasic.repository.TeacherRepository;
import com.sena.crudbasic.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository repo;

    // DTO -> MODEL
    private Teacher dtoToModel(TeacherDto dto) {
        Teacher t = new Teacher();
        t.setId(dto.getId());
        t.setName(dto.getName());
        return t;
    }

    @Override
    public List<Teacher> findAll() {
        return repo.findAll();
    }

    @Override
    public Teacher findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String save(TeacherDto dto) {
        Teacher t = dtoToModel(dto);
        repo.save(t);
        return "OK";
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "OK";
    }
}
