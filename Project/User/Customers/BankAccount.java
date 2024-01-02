package User.Customers;

import java.util.Scanner;

public class BankAccount{
    public int num;
    public float solde;

    public BankAccount(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your bank account number");
        this.num=scanner.nextInt();
        System.out.println("please enter your bank account balance");
        this.solde=scanner.nextFloat();
    }
}