package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.ClassroomDto;
import com.sena.crudbasic.model.Classroom;

public interface ClassroomService {

    List<Classroom> findAll();
    Classroom findById(int id);
    List<Classroom> filterByNumber(String number);
    String save(ClassroomDto dto);
    String delete(int id);
}
