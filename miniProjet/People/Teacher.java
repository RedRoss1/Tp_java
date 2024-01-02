package People;

import Groupment.Classe;

public class Teacher extends Person {
    public String degree;

    public Teacher(String n, int i, String d, int s, int f){
        super(n,i,s,f);
        this.degree=d;
    }

    public void Getter(String n, int i, String d){
        n=this.full_name;
        i=this.id;
        d=this.degree;
    }

    public void Setter(String n, int i, String d){
        this.full_name=n;
        this.id=i;
        this.degree=d;
    }

    public void seeTimeSheet(){
        System.out.println(this.full_name + "Teaches  from : " + (this.sheet).getStart() + "to : " + (this.sheet).getFinish());
    }

    public void Teach(Classe c){
        System.out.println(this.full_name + " is teaching the class " + c.getName());
    }
}
