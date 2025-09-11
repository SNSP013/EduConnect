package com.wecp.progressive.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String userName);
    // User findByTeacherId(int teacherId);
    // User findByStudentId(int studentId);
    // void deleteByTeacherId(int teacherId);
    // void deleteByStudentId(int studentId);
=======

public interface UserRepository {
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
}
