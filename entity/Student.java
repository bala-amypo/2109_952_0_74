package com.example.demo.entity;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;
    public Long getid(){
        return id;
    }
    public void setid(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setid(String name){
        this.id=id;
    }
}
