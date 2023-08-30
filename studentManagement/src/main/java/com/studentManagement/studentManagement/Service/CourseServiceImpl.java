package com.studentManagement.studentManagement.Service;

import com.studentManagement.studentManagement.Model.Course;
import com.studentManagement.studentManagement.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public Course getCourseById(Long id) {
        return null;
    }

    @Override
    public Course createCourse(Course course) {
        return null;
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {

    }
}
