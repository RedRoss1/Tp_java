package Groupment;
import java.util.Scanner;

public class TimeSheet {
    protected int start;
    protected int finish;

    public TimeSheet(int s, int f){
        this.start=s;
        this.finish=f;
    }

    public TimeSheet(){
        Scanner sc=new Scanner(System.in);
        int s,f;
        System.out.println("give the starting time");
        s=sc.nextInt();
        System.out.println("give the finishing time");
        f=sc.nextInt();
        this.start=s;
        this.finish=f;
    }

    public int getStart(){
        return this.start;
    }
    
    public int getFinish(){
        return finish;
    }
}
