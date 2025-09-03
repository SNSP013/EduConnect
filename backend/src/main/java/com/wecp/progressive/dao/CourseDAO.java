package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Course;

<<<<<<< HEAD
import java.util.List;

public interface CourseDAO {
    int addCourse(Course course);
    Course getCourseById(int courseId);
    void updateCourse(Course course);
    void deleteCourse(int courseId);
    List<Course> getAllCourses();
=======
import java.sql.SQLException;
import java.util.List;

public interface CourseDAO {
    int addCourse(Course course) throws SQLException;
    Course getCourseById(int courseId) throws SQLException;
    void updateCourse(Course course) throws SQLException;
    void deleteCourse(int courseId) throws SQLException;
    List<Course> getAllCourses() throws SQLException;
>>>>>>> bf6a64124f6b2604106261c506023c1b4bf7232e
}