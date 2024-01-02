package Groupment;

import java.util.HashMap;

import People.Student;

public class Club {
    public String name;
    protected int id;
    protected HashMap<Student,String> members;

    public Club(String n, int i){
        this.name=n;
        this.id=i;
        this.members=new HashMap<>();
    }

    public void addMember(Student s){
        (this.members).put(s,s.full_name);
    }

    public void seeMembers(){
        System.out.println(members);
    }
}
