package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface TeacherRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
    public Teacher findByTeacherId(int teacherId);
    public Teacher findByEmail(String email);
>>>>>>> ce4fa58d6deaf56a8d40fc79ad79f7c90ae6bf2f
}
