package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.GuardianDto;
import com.sena.crudbasic.model.Guardian;

public interface GuardianService {

    List<Guardian> findAll();
    Guardian findById(int id);
    String save(GuardianDto dto);
    String delete(int id);
}
