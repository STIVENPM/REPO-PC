package com.sena.crudbasic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="classroom")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_classroom")
    private int id;

    @Column(name="number", length = 10)
    private String number;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students;


    

    public Classroom(int id, String number, List<Student> students) {
        super();
        this.id = id;
        this.number = number;
        this.students = students;
    }
               public  Classroom() { 
		super(); 
	}

    
    public int getId (){
        return id;
    }
    public void setId (int id ){
        this.id = id;
    }

    public String getNumber (){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }


  
}
