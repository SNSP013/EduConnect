package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Teacher;

<<<<<<< HEAD
import java.util.List;

public interface TeacherDAO {
    int addTeacher(Teacher teacher);
    Teacher getTeacherById(int teacherId);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(int teacherId) ;
    List<Teacher> getAllTeachers();
=======
import java.sql.SQLException;
import java.util.List;

public interface TeacherDAO {
    int addTeacher(Teacher teacher) throws SQLException;
    Teacher getTeacherById(int teacherId) throws SQLException;
    void updateTeacher(Teacher teacher) throws SQLException;
    void deleteTeacher(int teacherId) throws SQLException;
    List<Teacher> getAllTeachers() throws SQLException;
>>>>>>> bf6a64124f6b2604106261c506023c1b4bf7232e
}
