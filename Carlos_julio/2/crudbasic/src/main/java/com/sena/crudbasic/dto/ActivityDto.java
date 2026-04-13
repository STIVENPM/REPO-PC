package com.sena.crudbasic.dto;

public class ActivityDto {

    private int id;
    private String name;

    public ActivityDto() {
        super();
    }

    public ActivityDto(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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
