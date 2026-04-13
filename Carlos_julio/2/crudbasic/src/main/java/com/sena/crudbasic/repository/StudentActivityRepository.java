package com.sena.crudbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.StudentActivity;

@Repository
public interface StudentActivityRepository 
        extends JpaRepository<StudentActivity, Integer> {

}
