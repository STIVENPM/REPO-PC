package com.sena.crudbasic.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="guardian")
public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_guardian")
    private int id;

    @Column(name="name", length = 50)
    private String name;

    @OneToMany(mappedBy = "guardian")
    private List<Student> students;


    public Guardian(int id, String name,  List<Student> students) {
        super();
        this.id = id;
        this.name = name;
        this.students = students;
    }
    public Guardian (){
        super();
    }
    
    public int getId (){
        return id;
    }
    public void setId (int id){
        this.id = id;
    }
    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
