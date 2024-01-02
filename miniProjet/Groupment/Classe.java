package Groupment;

import java.util.HashMap;

import People.Student;
import People.Teacher;

public class Classe{
    public String id; //Ex: MPI 3/4, IMI 2/2 ? CH 4/3 ...
    protected int nb_students;
    protected int nb_professors;
    protected HashMap<Teacher,String> T;//This HashMap will represent the teachers of each class, each key will be a Teacher reference and each value will be the corresponding teacher's name
    protected HashMap<Student,String> S;//This HashMap will represent the students of each class, each key will be a Student reference and each value will be the corresponding student's name


    public Classe(String n,int n1, int n2){
        this.id=n;
        this.nb_students=n1;
        this.nb_professors=n2;
        this.T=new HashMap<>();
        this.S=new HashMap<>();
    }

    public void Getter(int a, int b){
        a = this.nb_students;
        b = this.nb_professors;
    }

    public String getName(){
        return this.id;
    }

    public void Setter(String n,int a, int b){
        this.id=n;
        this.nb_students=a;
        this.nb_professors=b;
    }

    public void addStudent(Student s){
        S.put(s,s.full_name);
    }

    public void addTeacher(Teacher t){
        T.put(t,t.full_name);
    }

    public void seeStudents(){
        System.out.println("the students in this class are :");
        System.out.println(S);
    }

    public void seeTeachers(){
        System.out.println("the teachers in this class are :");
        System.out.println(T);
    }
}
