<<<<<<< HEAD
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Student } from '../../models/Student';

@Component({
  selector: 'app-studentsample',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './studentsample.component.html',
  styleUrls: ['./studentsample.component.scss']
})
export class StudentSampleComponent {
  student: Student;

  constructor() {
   
    this.student = new Student(
      1,
      'John Doe',
      new Date('1995-05-15'),
      '9876543210',
      'john.doe@example.com',
      '123 Main Street, City, State'
    );
  }

  logStudentAttributes(): void {
    this.student.logAttributes();
  }
}
=======

export class StudentSampleComponent {
  
}
>>>>>>> 529d0154115457f875d66b7565be669ba7ab27ce
