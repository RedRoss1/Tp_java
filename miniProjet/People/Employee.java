package People;

public class Employee extends Person {
    String job;

    public Employee(String n, int i, String j, int s, int f){
        super(n,i,s,f);
        this.job=j;
    }
}
