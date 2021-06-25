package com.webapp.projects.firstwebapp.controller;

import org.springframework.stereotype.Component;

@Component
public class Course{
    private long id;
    private String name;
    private String desc;

    public String getAuthor(){
        return author;
    }

    private String author;

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
