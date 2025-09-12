package com.wecp.progressive.exception;

<<<<<<< HEAD
public class TeacherAlreadyExistsException {
=======
public class TeacherAlreadyExistsException extends RuntimeException{
    public TeacherAlreadyExistsException(String msg){
        super(msg);
    }
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}