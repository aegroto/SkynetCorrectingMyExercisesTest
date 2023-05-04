package com.example.Hybernate;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class Class {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String title;
	@Column (nullable = false)
	private String description;
	
	public Class() {
	}
	
	public Class(int id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
