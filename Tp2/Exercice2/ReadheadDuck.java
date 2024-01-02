package Exercice2;

public class ReadheadDuck extends Duck implements Quackable, Flyable {

    public void display(){
        System.out.println("Displaying Readhead");
    }

    public void fly(){
        System.out.println("Flying Readhead");
    }

    public void quack(){
        System.out.println("Quack Readhead");
    }


}
