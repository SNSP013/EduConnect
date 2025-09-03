package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface StudentRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByStudentId(int studentId);
>>>>>>> bf6a64124f6b2604106261c506023c1b4bf7232e
}
