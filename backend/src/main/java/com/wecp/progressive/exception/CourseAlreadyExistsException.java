package com.wecp.progressive.exception;

<<<<<<< HEAD
public class CourseAlreadyExistsException {
=======
public class CourseAlreadyExistsException extends RuntimeException{
    public CourseAlreadyExistsException(String msg){
        super(msg);
    }
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}