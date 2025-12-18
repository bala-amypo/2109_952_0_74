package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@RestController
public class StudentController{
    @Autowired
    StudentService sr;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return sr.postData(st);
    }
    @GetMapping("/getall")
    public List<Student>get(){
        return stdser.getAllStudents();
    }
    @GetMapping("/getById/{id}")
    public Optional<Student>getId(@PathVariable Long id{
        return stdser.getById(id);
    }
    @PutMapping("/update/{id}")
}