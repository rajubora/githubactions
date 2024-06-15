package com.springboot.springboot.controller;

import com.springboot.springboot.entity.Course;
import com.springboot.springboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class MyController {
   @Autowired
   private CourseService Courseservice ;

    @GetMapping
    public String home(){

        return "this is homepage";
    }


    @GetMapping("/courses")
    public List<Course> getCourse(){

     return  this.Courseservice.getCourses();
    }


}
