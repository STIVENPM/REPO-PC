package com.sena.crudbasic.dto;

public class StudentSubjectDto {

    private int id;
    private int idStudent; // FK a student
    private int idSubject; // FK a subject

    public StudentSubjectDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }
}
