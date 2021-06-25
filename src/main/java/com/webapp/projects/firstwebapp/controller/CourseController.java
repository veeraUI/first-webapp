package com.webapp.projects.firstwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController{
    List<Course> courses=Arrays.asList(new Course(1, "java", "Object oriented programming", "veera"), new Course(2, "react", "Declarative Programming Language", "veera"));
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courses;

    }

    @GetMapping("/courses/1")
    public Course getCourse() {
        return courses.get(1);
    }

}
