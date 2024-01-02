package Exercice2;

import Exercice2.Instructor;


public class Test {
    public static void main(String[] args) {
  
        Instructor instructor = new Instructor(101, "Ali", "khemakhem");
        Course javaCourse = new Course(1, "Java oop", instructor);

        Student student = new Student(1001, "Ahmed", "ali");
        student.enroll(javaCourse);

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Enrolled Courses: " + student.getCourses().get(0).getCourseName());
        System.out.println("Instructor: " + javaCourse.getInstructor().getFirstName() + " " + javaCourse.getInstructor().getLastName());
    }
}
