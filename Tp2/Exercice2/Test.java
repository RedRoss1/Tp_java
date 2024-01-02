package Exercice2;

public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        ReadheadDuck redheadDuck = new ReadheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyduck = new DecoyDuck();

        System.out.println("Mallard Duck:");
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("Redhead Duck:");
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.fly();

        System.out.println("Rubber Duck:");
        rubberDuck.display();
        rubberDuck.quack();

        System.out.println("Decoy Duck");
        decoyduck.display();
        
    }
}

