package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface AttendanceRepository {
=======
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{

    public List<Attendance> findByStudent_StudentId(int studentId);
    public List<Attendance> findByCourse_CourseId(int courseId);
    public Optional<Attendance> findByCourse_CourseIdAndStudent_StudentIdAndAttendanceDate(int courseId, int studentId, Date attendanceDate);

    // public void deleteByCourseId(int courseId);
    // public void deleteByStudentId(int studentId);
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}
