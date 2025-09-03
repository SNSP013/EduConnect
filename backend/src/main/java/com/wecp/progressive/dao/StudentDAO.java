package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Student;

<<<<<<< HEAD
import java.util.List;

public interface StudentDAO {
    int addStudent(Student student);
    Student getStudentById(int studentId);
    void updateStudent (Student student);
    void deleteStudent (int studentId);
    List<Student> getAllStudents();
=======
import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    int addStudent(Student student) throws SQLException;
    Student getStudentById(int studentId) throws SQLException;
    void updateStudent (Student student) throws SQLException;
    void deleteStudent (int studentId) throws SQLException;
    List<Student> getAllStudents() throws SQLException;
>>>>>>> bf6a64124f6b2604106261c506023c1b4bf7232e
}