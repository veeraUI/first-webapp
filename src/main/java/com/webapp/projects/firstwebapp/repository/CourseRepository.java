package com.webapp.projects.firstwebapp.repository;

import com.webapp.projects.firstwebapp.controller.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{}
