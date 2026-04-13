package com.sena.crudbasic.dto;

public class TeacherCourseDto {

    private int id;
    private int idTeacher;
    private int idCourse;

    public TeacherCourseDto() { }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getIdTeacher() {
        return idTeacher;
    }
    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
}
