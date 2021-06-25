package com.webapp.projects.firstwebapp.controller;

import com.webapp.projects.firstwebapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/courses/1")
    public Optional<Course> getCourse() {
        return repository.findById(10001l);
    }

}
