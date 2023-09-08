package com.example.demo.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Course_Details")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id;
	public String name;   
	public Double price;
}
