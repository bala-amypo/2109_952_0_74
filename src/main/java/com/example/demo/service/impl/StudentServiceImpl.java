package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentRepository sr;

@Override
public Student postData(Student st){

    return sr.save(st);

}
@Override
public List<Student>getAllStudents(){
    reeturn stdrepo.findAll;
}
@Override



}