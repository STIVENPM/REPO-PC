package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.SubjectDto;
import com.sena.crudbasic.model.Subject;
import com.sena.crudbasic.repository.SubjectRepository;
import com.sena.crudbasic.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository repo;

    // DTO -> MODEL
    private Subject dtoToModel(SubjectDto dto) {
        Subject s = new Subject();
        s.setId(dto.getId());
        s.setName(dto.getName());
        return s;
    }

    @Override
    public List<Subject> findAll() {
        return repo.findAll();
    }

    @Override
    public Subject findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String save(SubjectDto dto) {
        Subject s = dtoToModel(dto);
        repo.save(s);
        return "OK";
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "OK";
    }
}
