package com.wecp.progressive.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;

=======
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
public class LoginResponse {
   private String token;
   private String roles;
   private Integer userId;
<<<<<<< HEAD
   private Integer studentId;
   private Integer teacherId;
   private Integer referenceId;

   public LoginResponse(@JsonProperty("token") String token, String roles, Integer userId, Integer studentId,
         Integer teacherId,
         Integer referenceId) {
      this.token = token;
      this.roles = roles;
      this.userId = userId;
      this.studentId = studentId;
      this.teacherId = teacherId;
      this.referenceId = referenceId;
   }

   public LoginResponse(@JsonProperty("token") String token, String roles, Integer userId, Integer studentId,
         Integer teacherId) {
      this.token = token;
      this.roles = roles;
      this.userId = userId;
      this.studentId = studentId;
      this.teacherId = teacherId;
   }

   public String getToken() {
      return token;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getRoles() {
      return roles;
   }

   public void setRoles(String roles) {
      this.roles = roles;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }

   public Integer getStudentId() {
      return studentId;
   }

   public void setStudentId(Integer studentId) {
      this.studentId = studentId;
   }

   public Integer getTeacherId() {
      return teacherId;
   }

   public void setTeacherId(Integer teacherId) {
      this.teacherId = teacherId;
   }

   public Integer getReferenceId() {
      return referenceId;
   }

   public void setReferenceId(Integer referenceId) {
      this.referenceId = referenceId;
   }

=======
   private Integer referenceId;
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
}
