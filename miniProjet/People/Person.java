package People;

import Groupment.TimeSheet;

public class Person {
    public String full_name;
    protected int id;
    protected TimeSheet sheet;

    public Person(String n, int i, int s, int f){
        this.full_name=n;
        this.id=i;
        sheet=new TimeSheet(s,f);
    }

    public void seeTimeSheet(){
        System.out.println(this.full_name + "works from : " + (this.sheet).getStart() + " to : " + (this.sheet).getFinish());
    }
}
