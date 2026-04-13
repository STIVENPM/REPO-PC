package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.ClassroomDto;
import com.sena.crudbasic.model.Classroom;
import com.sena.crudbasic.repository.ClassroomRepository;
import com.sena.crudbasic.service.ClassroomService;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository repo;

    private Classroom dtoToModel(ClassroomDto dto) {
        Classroom c = new Classroom();
        c.setId(dto.getId());
        c.setNumber(dto.getNumber());
        return c;
    }

    @Override
    public List<Classroom> findAll() {
        return repo.findAll();
    }

    @Override
    public Classroom findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Classroom> filterByNumber(String number) {
        return repo.filterByNumber(number);
    }

    @Override
    public String save(ClassroomDto dto) {
        Classroom c = dtoToModel(dto);
        repo.save(c);
        return "OK";
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "OK";
    }
}
