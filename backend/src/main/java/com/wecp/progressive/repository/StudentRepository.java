package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface StudentRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findByStudentId(int studentId);
    public Student findByEmail(String email);
>>>>>>> ce4fa58d6deaf56a8d40fc79ad79f7c90ae6bf2f
}
