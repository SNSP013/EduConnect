package com.wecp.progressive.exception;

<<<<<<< HEAD
public class CourseNotFoundException {
=======
public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(String msg){
        super(msg);
    }
>>>>>>> 707a60c5868e29d4b27ae6d1f816fe8baf72574e
}