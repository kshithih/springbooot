package tut.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import tut.binding.Course;

public interface CourseRepository extends JpaRepository<Course,Serializable> {
	  

}
