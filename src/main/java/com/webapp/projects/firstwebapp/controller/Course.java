package com.webapp.projects.firstwebapp.controller;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity(name = "CourseTable") // creates table name as COURSE_TABLE instead of COURSE
public class Course{
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Column(name = "course_desc") // creates columns name as course_desc instead of default desc
    private String desc;
    private String author;

    public String getAuthor(){
        return author;
    }



    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    public Course() {

    }

    @Override
    public String toString(){
        return "Course{" + "id=" + id + ", name='" + name + '\'' + ", desc='" + desc + '\'' + ", author='" + author + '\'' + '}';
    }

    public Course(long id, String name, String desc, String author){
        super();
        this.id=id;
        this.name=name;
        this.desc=desc;
        this.author=author;
    }
}
