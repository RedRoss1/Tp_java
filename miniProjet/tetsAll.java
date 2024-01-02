import java.util.Scanner;
import People.*;
import Groupment.*;

public class tetsAll {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //creating students : 
        Student s1= new Student("Mohamed Kader",20,1234,10,17);
        Student s2=new Student("Ahmed Ali",21,1567,10 ,17);

        //creating teacher : 
        Teacher t= new Teacher("Abbes Jerbi", 9890, "PHD", 8,18);

        //creating employee : 
        Employee e = new Employee("Moncef Kader", 8975, "Janitor",8,12);

        //creating class : 
        Classe c = new Classe("IMI 2/3", 2, 2);

        //creating club : 
        Club cl = new Club ("IEE",0120);

        //creating room : 
        Room r=new Room(220, "salle de conference");

        //creating course : 
        Course am= new Course (5684, "Advanced Mathematics");

        //creating subject : 
        Subject s = new Subject ("Algebra 1");

        //testing each class'methods : 

        //student : 
        s1.seeTimeSheet();

        //classe : 
        c.addStudent(s1);
        c.addStudent(s2);
        c.addTeacher(t);
        c.seeTeachers();
        c.seeStudents();

        //teacher : 
        t.Teach(c);
        t.seeTimeSheet();

        //Employee : 
        e.seeTimeSheet();

        //Club : 
        cl.addMember(s1);
        cl.seeMembers();

        //course : 
        am.addStudent(s2);
        am.requireSubject(s);





    }
}
