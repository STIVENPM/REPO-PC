package com.sena.crudbasic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_teacher")
    private int id;

    @Column(name="name", length = 50)
    private String name;
    @OneToMany(mappedBy = "teacher")
    private List<TeacherCourse> teacherCourses;


    public Teacher(int id, String name, List<TeacherCourse> teacherCourses) {
        super();
        this.id = id;
        this.name = name;
        this.teacherCourses = teacherCourses;
    }
          public  Teacher() { 
		super();
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
    public List<TeacherCourse> getTeacherCourses() {
        return teacherCourses;
    }
    public void setTeacherCourses(List<TeacherCourse> teacherCourses) {
        this.teacherCourses = teacherCourses;
    }

}
