package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface TeacherRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
>>>>>>> bf6a64124f6b2604106261c506023c1b4bf7232e
}
