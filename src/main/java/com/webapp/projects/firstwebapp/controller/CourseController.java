package com.webapp.projects.firstwebapp.controller;

import com.webapp.projects.firstwebapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController{
    @Autowired
    private CourseRepository repository;
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();

    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable long id) {
        Optional<Course> courseById=repository.findById(id);


        if(!courseById.isPresent()) {
            throw new RuntimeException("Course not found with id " +  id);
        }
        return courseById.get();
    }


    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }



}
