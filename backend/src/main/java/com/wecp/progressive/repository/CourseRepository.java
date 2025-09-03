package com.wecp.progressive.repository;

<<<<<<< HEAD
public interface CourseRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
>>>>>>> bf6a64124f6b2604106261c506023c1b4bf7232e
}
