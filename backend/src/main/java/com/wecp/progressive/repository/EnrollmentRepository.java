package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface EnrollmentRepository {
=======
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer>{

    // Optional<Enrollment> findByStudent_StudentIdAndCourse_CourseId(int studentId, int courseId);

    List<Enrollment> findAllByStudent_StudentId(int student_id);

    List<Enrollment> findAllByCourse_CourseId(int course_id);

    // void deleteByCourseId(int courseId);

    // void deleteByStudentId(int studentId);

    // void deleteByTeacherId(int teacherId);
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}
