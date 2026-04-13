package com.sena.crudbasic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_subject")
    private int id;

    @Column(name="name", length = 50)
    private String name;

    @OneToMany(mappedBy = "subject")
    private List<StudentSubject> studentSubjects;


    public Subject(int id, String name, List<StudentSubject> studentSubjects) {
        super();
        this.id = id;
        this.name = name;
        this.studentSubjects = studentSubjects;
    }
          public  Subject() { 
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
    public List<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }
    public void setStudentSubjects(List<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

}
