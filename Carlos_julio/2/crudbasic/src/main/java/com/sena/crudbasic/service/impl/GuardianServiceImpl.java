package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.GuardianDto;
import com.sena.crudbasic.model.Guardian;
import com.sena.crudbasic.repository.GuardianRepository;
import com.sena.crudbasic.service.GuardianService;

@Service
public class GuardianServiceImpl implements GuardianService {

    @Autowired
    private GuardianRepository repo;

    // DTO -> MODEL
    private Guardian dtoToModel(GuardianDto dto) {
        Guardian g = new Guardian();
        g.setId(dto.getId());
        g.setName(dto.getName());
        return g;
    }

    @Override
    public List<Guardian> findAll() {
        return repo.findAll();
    }

    @Override
    public Guardian findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String save(GuardianDto dto) {
        Guardian g = dtoToModel(dto);
        repo.save(g);
        return "OK";
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "OK";
    }
}
