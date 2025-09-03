package com.wecp.progressive.service;

import com.wecp.progressive.entity.Course;

import java.util.List;

public interface CourseService {

<<<<<<< HEAD
    public List<Course> getAllCourses();

    public Course getCourseById(int courseId);

    public Integer addCourse(Course course);

    public void updateCourse(Course course);

    public void deleteCourse(int courseId);
=======
    public List<Course> getAllCourses() throws Exception;

    public Course getCourseById(int courseId) throws Exception;

    public Integer addCourse(Course course) throws Exception;

    public void updateCourse(Course course) throws Exception;

    public void deleteCourse(int courseId) throws Exception;
>>>>>>> bf6a64124f6b2604106261c506023c1b4bf7232e

    //Do not implement these methods in CourseServiceImplJdbc.java class
    default public List<Course> getAllCourseByTeacherId(int teacherId) { return null; }
}
