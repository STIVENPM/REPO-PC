package com.sena.crudbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Guardian;

@Repository
public interface GuardianRepository 
        extends JpaRepository<Guardian, Integer> {

    // después puedes agregar filtros con @Query
}
