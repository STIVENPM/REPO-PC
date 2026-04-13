package com.sena.crudbasic.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private int id;

    @Column(name = "name", length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "id_guardian")
    private Guardian guardian;
    
    @ManyToOne
    @JoinColumn(name = "id_classroom")
    private Classroom classroom;

    @OneToMany(mappedBy = "student")
    private List<StudentSubject> studentSubjects;

    @OneToMany(mappedBy = "student")
    private List<StudentActivity> studentActivities;



    public Student(int id, String name, Course course) {
        super();
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public   Student() { 
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public List<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(List<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    public List<StudentActivity> getStudentActivities() {
        return studentActivities;
    }

    public void setStudentActivities(List<StudentActivity> studentActivities) {
        this.studentActivities = studentActivities;
    }
}
    
    


