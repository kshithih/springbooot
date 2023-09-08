package tut.service;

import java.util.List;

import tut.binding.Course;

public interface CourseService {
public String upsert(Course course);
public Course getById(Integer id);
public List<Course> getAllCourse();
public String deleteById(Integer id);
}
