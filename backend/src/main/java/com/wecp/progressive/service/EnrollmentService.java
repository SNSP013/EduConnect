package com.wecp.progressive.service;

import com.wecp.progressive.entity.Enrollment;

<<<<<<< HEAD
import java.util.List;

public interface EnrollmentService {
    List<Enrollment> getAllEnrollments();

    int createEnrollment(Enrollment enrollment);

    public void updateEnrollment(Enrollment enrollment);

    public Enrollment getEnrollmentById(int enrollmentId);

    public List<Enrollment> getAllEnrollmentsByStudent(int studentId);

    public List<Enrollment> getAllEnrollmentsByCourse(int courseId);

=======
import java.text.ParseException;
import java.util.List;

public interface EnrollmentService {
    List<Enrollment> getAllEnrollments() throws ParseException;

    int createEnrollment(Enrollment enrollment) throws Exception;

    public void updateEnrollment(Enrollment enrollment) throws Exception;

    public Enrollment getEnrollmentById(int enrollmentId)  throws ParseException;

    public List<Enrollment> getAllEnrollmentsByStudent(int studentId) throws Exception;

    public List<Enrollment> getAllEnrollmentsByCourse(int courseId) throws Exception;
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}
