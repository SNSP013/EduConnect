package com.wecp.progressive.service;

import com.wecp.progressive.entity.Attendance;

import java.util.List;

public interface AttendanceService {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
    List<Attendance> getAllAttendance() throws Exception;

    Attendance createAttendance(Attendance attendance) throws Exception;

    void deleteAttendance(int attendanceId) throws Exception;

    List<Attendance> getAttendanceByStudent(int studentId) throws Exception;

    List<Attendance> getAttendanceByCourse(int courseId) throws Exception;
}
<<<<<<< HEAD
=======
=======
    List<Attendance> getAllAttendance();

    Attendance createAttendance(Attendance attendance);

    void deleteAttendance(int attendanceId);

    List<Attendance> getAttendanceByStudent(int studentId);

    List<Attendance> getAttendanceByCourse(int courseId);
}
>>>>>>> 15668bcf1f6dd835ca25ab5e5f19e5b5570ab204
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
