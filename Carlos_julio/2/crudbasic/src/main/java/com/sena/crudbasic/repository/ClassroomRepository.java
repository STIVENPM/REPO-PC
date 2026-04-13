package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {

    @Query("""
        SELECT c
        FROM classroom c
        WHERE c.number LIKE %?1%
    """)
    List<Classroom> filterByNumber(String number);
}
