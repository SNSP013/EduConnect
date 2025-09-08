package com.wecp.progressive.exception;

<<<<<<< HEAD
public class TeacherAlreadyExistsException {
=======
public class TeacherAlreadyExistsException extends RuntimeException{
    public TeacherAlreadyExistsException(String msg){
        super(msg);
    }
>>>>>>> ce4fa58d6deaf56a8d40fc79ad79f7c90ae6bf2f
}