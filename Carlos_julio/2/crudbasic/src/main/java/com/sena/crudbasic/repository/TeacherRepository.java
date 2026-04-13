package com.sena.crudbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Teacher;

@Repository
public interface TeacherRepository 
        extends JpaRepository<Teacher, Integer> {

}
