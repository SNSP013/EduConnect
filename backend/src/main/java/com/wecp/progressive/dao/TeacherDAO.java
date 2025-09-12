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
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}
