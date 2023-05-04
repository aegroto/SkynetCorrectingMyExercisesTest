package com.example.Hybernate;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Student studentId;
	@ManyToOne
	private Class classId;
	
	public Enrollment() {
	}
	
	public Enrollment(int id, Student studentId, Class classId) {
		this.id = id;
		this.studentId = studentId;
		this.classId = classId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Student getStudentId() {
		return studentId;
	}
	
	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}
	
	public Class getClassId() {
		return classId;
	}
	
	public void setClassId(Class classId) {
		this.classId = classId;
	}
}
