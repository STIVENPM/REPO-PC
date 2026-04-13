package com.sena.crudbasic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_activity")
    private int id;

    @Column(name="name", length = 50)
    private String name;
        
    @OneToMany(mappedBy = "activity")
    private List<StudentActivity> studentActivities;

    public Activity(int id, String name, List<StudentActivity> studentActivities) {
        super();
        this.id = id;
        this.name = name;
    }
             public  Activity() { 
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
    public List<StudentActivity> getStudentActivities() {
        return studentActivities;
    }
    public void setStudentActivities(List<StudentActivity> studentActivities) {
        this.studentActivities = studentActivities;
    }
   


}
