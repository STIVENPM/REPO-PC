package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.ActivityDto;
import com.sena.crudbasic.model.Activity;
import com.sena.crudbasic.repository.ActivityRepository;
import com.sena.crudbasic.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository repo;

    // DTO -> Model
    private Activity dtoToModel(ActivityDto dto) {
        Activity a = new Activity();
        a.setId(dto.getId());
        a.setName(dto.getName());
        // NO tocamos studentActivities aquí
        return a;
    }

    @Override
    public List<Activity> findAll() {
        return repo.findAll();
    }

    @Override
    public Activity findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Activity> filterByName(String name) {
        return repo.filterByName(name);
    }

    @Override
    public String save(ActivityDto dto) {
        Activity a = dtoToModel(dto);
        repo.save(a);
        return "OK";
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return "OK";
    }
}
