package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {

    @Query(""
        + "SELECT a "
        + "FROM activity a "
        + "WHERE a.name like %?1%")
    List<Activity> filterByName(String name);
}
