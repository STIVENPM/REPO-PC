package com.sena.crudbasic.model;

import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_course")
	private int id;

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "email", length = 100)
	private String email;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	@OneToMany(mappedBy = "course")
	private List<Student> students; 

	@OneToMany(mappedBy = "course")
	private List<TeacherCourse> teacherCourses;


	public Course(int id, String name,  List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
	public Course() { 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	





	


}
