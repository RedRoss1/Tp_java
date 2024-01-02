package People;

import Groupment.TimeSheet;
public class Student extends Person {
    protected int age;
    protected TimeSheet t;
    

    public Student(String n, int a, int i, int s, int f){
        super(n,i,s,f);
        this.age=a;
    }

    public void Setter(String n, int a, int i){
        this.full_name=n;
        this.age=a;
        this.id=i;
    }

    public void Getter(String n, int a, int i){
        n=this.full_name;
        a=this.age;
        i=this.id;
    }

    public void seeTimeSheet(){
        System.out.println(this.full_name + "Studies from : " + (this.sheet).getStart() + "to : " + (this.sheet).getFinish());
    }
}
