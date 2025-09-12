package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface UserRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String userName);
    // User findByTeacherId(int teacherId);
    // User findByStudentId(int studentId);
    // void deleteByTeacherId(int teacherId);
    // void deleteByStudentId(int studentId);
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}
