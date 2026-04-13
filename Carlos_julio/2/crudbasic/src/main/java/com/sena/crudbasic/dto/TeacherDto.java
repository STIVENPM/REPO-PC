package com.sena.crudbasic.dto;

public class TeacherDto {

    private int id;
    private String name;

    public TeacherDto() {
        // constructor vacío
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
}
