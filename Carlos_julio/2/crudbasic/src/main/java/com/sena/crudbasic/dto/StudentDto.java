package com.sena.crudbasic.dto;

public class StudentDto {

    private int id;
    private String name;
    private int idCourse; // FK al curso

    public StudentDto() {
        // constructor vacío (puedes agregar otros)
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
}
