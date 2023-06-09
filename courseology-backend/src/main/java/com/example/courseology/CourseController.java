package com.example.courseology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;


    // CREATE

    // READ
    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/courses")
    public ArrayList<Course> getCourses(){
        return courseRepository.getAllCourses();
    }
    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseRepository.getCourseById(id);
    }

    //UPDATE

    //DELETE

}
