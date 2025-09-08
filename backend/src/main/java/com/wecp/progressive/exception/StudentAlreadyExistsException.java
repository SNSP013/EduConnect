package com.wecp.progressive.exception;

<<<<<<< HEAD
public class StudentAlreadyExistsException {
=======
public class StudentAlreadyExistsException extends RuntimeException{
    public StudentAlreadyExistsException(String msg){
        super(msg);
    }
>>>>>>> ce4fa58d6deaf56a8d40fc79ad79f7c90ae6bf2f
}