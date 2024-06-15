package com.springboot.springboot.serviceImpl;

import com.springboot.springboot.entity.Course;
import com.springboot.springboot.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

 @Service
public class CourseServiceImpl  implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list= new ArrayList<>();
        list.add(new Course(134,"testData", "data is for testing data"));

    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
}
