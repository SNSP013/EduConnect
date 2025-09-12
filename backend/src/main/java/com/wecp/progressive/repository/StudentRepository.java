package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface StudentRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findByStudentId(int studentId);
    public Student findByEmail(String email);
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}
