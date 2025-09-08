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
>>>>>>> ce4fa58d6deaf56a8d40fc79ad79f7c90ae6bf2f

    //Do not implement these methods in CourseServiceImplJdbc.java class
    default public List<Course> getAllCourseByTeacherId(int teacherId) { return null; }
}
