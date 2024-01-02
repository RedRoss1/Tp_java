package Exercice2;

interface Quackable{
    void quack();
}

interface Flyable{
    void fly();
}

public class MallardDuck extends Duck implements Quackable, Flyable {

    public void display(){
        System.out.println("Displaying Mallard");
    }

    public void fly(){
        System.out.println("Flying Mallard");
    }

    public void quack(){
        System.out.println("Quack Mallard");
    }


}
