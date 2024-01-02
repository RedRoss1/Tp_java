package User.Admins;

import User.Account;
import User.Customers.Customer;
import ProductManagement.ToyProduct;
import ProductManagement.ElectronicsProduct;
import ConsoleManagement.Console;

import java.util.Scanner;

public class Admin extends Account {
    public static  int AdminCode=1234; //this code will be used by useres trying to create an admin account

    public Admin(){
        super();
        (this.list).put(this.username,this.password);
        (this.list2).put(this.username, "Admin");
    }

    public void CreateProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the available quantity of the new product");
        int q=scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter the category of the new product");
        String s= scanner.nextLine();
        switch (s){
            case "Toy":
                ToyProduct t= new ToyProduct();
                (t.i).put(t.id,q);
                (t.pr).put(t.id,t.price);
                break;

            case "Electronics":
                ElectronicsProduct e = new ElectronicsProduct();
                (e.i).put(e.id,q);
                (e.pr).put(e.id,e.price);
                break;
                
        }
    }

    public String GetRole(){
        return "Admin";
    }

    public void Ban(String name){ //Second Additional Feature (of my choice): An admin could ban permanently a customer, the string parameter is the name of the customer to ban

        (this.list).remove(name);
        (this.list2).remove(name);
        Console.Cus.remove(name);
    }
}
