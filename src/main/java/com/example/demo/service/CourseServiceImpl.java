package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRep;
	@Override
	public String upsert(Course course) {
		courseRep.save(course);
		return null;
	}

	@Override
	public Course getById(Integer id) {
		Optional<Course> findById = courseRep.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		
		return courseRep.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(courseRep.existsById(id)) {
		 courseRep.deleteById(id);
		 return " success";
		}		 return " not found";


	}

}
