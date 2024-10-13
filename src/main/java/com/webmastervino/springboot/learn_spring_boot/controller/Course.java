package com.webmastervino.springboot.learn_spring_boot.controller;

public class Course {

    private long id;
    private String name;
    private String author;

    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


}
