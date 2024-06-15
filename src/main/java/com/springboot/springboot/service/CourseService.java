package com.springboot.springboot.service;

import com.springboot.springboot.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    public List<Course> getCourses();

}
