package com.wecp.progressive.repository;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
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
}
<<<<<<< HEAD
=======
=======

public interface AttendanceRepository {
}
>>>>>>> 15668bcf1f6dd835ca25ab5e5f19e5b5570ab204
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
