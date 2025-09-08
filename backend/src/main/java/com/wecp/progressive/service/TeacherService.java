package com.wecp.progressive.service;

import com.wecp.progressive.dto.TeacherDTO;
import com.wecp.progressive.entity.Teacher;

import java.util.List;

public interface TeacherService {

<<<<<<< HEAD
    public List<Teacher> getAllTeachers();

    public Integer addTeacher(Teacher teacher);

    public List<Teacher> getTeacherSortedByExperience();

    default void emptyArrayList() {
    }

    //Do not implement these methods in TeacherServiceImplArraylist.java class
    default public void updateTeacher(Teacher teacher) { }

    default public void deleteTeacher(int teacherId) { }

    default Teacher getTeacherById(int teacherId) { return null; }
=======
    public List<Teacher> getAllTeachers() throws Exception;

    public Integer addTeacher(Teacher teacher) throws Exception;

    public List<Teacher> getTeacherSortedByExperience() throws Exception;

    default void emptyArrayList() throws Exception{
    }

    //Do not implement these methods in TeacherServiceImplArraylist.java class
    default public void updateTeacher(Teacher teacher)  throws Exception { }

    default public void deleteTeacher(int teacherId)  throws Exception { }

    default Teacher getTeacherById(int teacherId)  throws Exception { return null; }
>>>>>>> ce4fa58d6deaf56a8d40fc79ad79f7c90ae6bf2f

    //Do not implement these methods in TeacherServiceImplArraylist.java and TeacherServiceImplJdbc.java class
    //Do not implement in TeacherServiceImplJpa.java until Day-13
    default public void modifyTeacherDetails(TeacherDTO teacherDTO) { }
}
