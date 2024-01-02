package Groupment;

import java.util.HashMap;

import People.Student;

public class Course {
    protected int id;
    protected String course_name;
    protected HashMap<Student,String> studentsEnrolled;

    public Course(int i, String n){
        this.id=i;
        this.course_name=n;
        this.studentsEnrolled=new HashMap<>();
    }

    public void addStudent(Student s){
        (this.studentsEnrolled).put(s,s.full_name);
    }

    public void requireSubject(Subject s){
        System.out.println("This course requires the subject : " + s.name);
    }

}
