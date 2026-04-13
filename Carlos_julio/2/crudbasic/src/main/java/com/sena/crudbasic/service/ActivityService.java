package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.ActivityDto;
import com.sena.crudbasic.model.Activity;

public interface ActivityService {

    List<Activity> findAll();
    Activity findById(int id);
    List<Activity> filterByName(String name);
    String save(ActivityDto dto);
    String delete(int id);
}
