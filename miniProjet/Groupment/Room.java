package Groupment;

import java.util.Scanner;

public class Room {
    public int number;
    public String room_name;

    public Room(int num, String n){
        this.number=num;
        this.room_name=n;
    }

    public Room(){
        Scanner sc = new Scanner(System.in);
        int num;
        String n;
        System.out.println("please give the room number");
        num=sc.nextInt();
    }

    public int getNum(){
        return this.number;
    }

    public String getName(){
        return this.room_name;
    }
}
