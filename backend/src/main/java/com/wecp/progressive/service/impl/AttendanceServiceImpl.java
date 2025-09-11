package com.wecp.progressive.service.impl;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Attendance;
import com.wecp.progressive.exception.AttendanceAlreadyExistsException;
import com.wecp.progressive.repository.AttendanceRepository;
import com.wecp.progressive.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    AttendanceRepository attendanceRepository;

    @Override
    public List<Attendance> getAllAttendance() throws Exception {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance createAttendance(Attendance attendance) throws Exception {
        // List<Attendance> attendances = attendanceRepository.findAll();
        // for (Attendance a : attendances) {
        //     if (a.getStudent().equals(attendance.getStudent()) && a.getCourse().equals(attendance.getCourse())
        //             && a.getAttendanceDate().equals(attendance.getAttendanceDate())) {
        //         throw new AttendanceAlreadyExistsException("Attendance already marked");
        //     }
        // }
        Attendance newAttendance = attendanceRepository.save(attendance);
        return newAttendance;
    }

    @Override
    public void deleteAttendance(int attendanceId) throws Exception {
        Attendance attendance = attendanceRepository.findById(attendanceId).orElse(null);
        if (attendance != null) {
            attendanceRepository.deleteById(attendanceId);
        }
    }

    @Override
    public List<Attendance> getAttendanceByStudent(int studentId) throws Exception {
        List<Attendance> attendancesByStudent = attendanceRepository.findByStudent_StudentId(studentId);
        return attendancesByStudent;
    }

    @Override
    public List<Attendance> getAttendanceByCourse(int courseId) throws Exception {
        List<Attendance> attendancesByCourse = attendanceRepository.findByCourse_CourseId(courseId);
        return attendancesByCourse;
    }
<<<<<<< HEAD
=======
=======
public class AttendanceServiceImpl  {
>>>>>>> 15668bcf1f6dd835ca25ab5e5f19e5b5570ab204
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7

}