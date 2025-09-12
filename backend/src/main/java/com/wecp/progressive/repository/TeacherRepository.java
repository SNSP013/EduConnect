package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface TeacherRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
    public Teacher findByTeacherId(int teacherId);
    public Teacher findByEmail(String email);
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}
