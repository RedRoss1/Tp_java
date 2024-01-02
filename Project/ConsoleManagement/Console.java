package ConsoleManagement;

import java.util.Scanner;
import java.util.HashMap;

import ProductManagement.Product;
import ProductManagement.ElectronicsProduct;
import ProductManagement.ToyProduct;
import User.Customers.Customer;
import User.Account;
import User.Admins.Admin;


public class Console{

    public static HashMap <String,Admin> Adm = new HashMap<>(); //each key will be a username and each value will be a reference to their Admin account
    public static HashMap <String,Customer> Cus = new HashMap<>(); //each key will be a username and each value will be a reference to their Customer account
    Admin a;
    Customer c;

    public void start() {
        System.out.println("Welcome to our online e-commerce platform. We are very pleased to have you.");
        System.out.println("To sign in to an already existing account, please type 1. To create a new account, please type 0.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        switch (x) {
            case 0:
                System.out.println("What's the role of the account you want to create?");
                String s = scanner.nextLine();
                switch (s) {
                    case "Admin":
                        System.out.println("Enter the code that proves you have access to an admin post");
                        int code = scanner.nextInt();
                        if (code == 1234) {
                            this.a = new Admin();
                            Adm.put(a.username,a);
                            (Account.list2).put(a.username,"Admin");
                            (Account.list).put(a.username,a.password);
                            this.ConsoleAdmin();
                            break;

                        } else {
                            System.out.println("Incorrect code. Exiting.");
                            System.exit(1);
                        }
                        break;
                    case "Customer":
                        c = new Customer();
                        (Account.list2).put(a.username,"Customer");
                        (Account.list).put(a.username,a.password);
                        Cus.put(c.username,c);
                        this.ConsoleCustomer();
                        break;
                    default:
                        System.out.println("Invalid role. Exiting.");
                        System.exit(1);
                }
                break;

            case 1:
                System.out.println("Please enter your username");
                String u = scanner.nextLine();
                String p = Account.list.get(u);
                System.out.println("Please enter your password");
                String p1 = scanner.nextLine();
                if (!p1.equals(p)) {
                    System.out.println("Wrong password. Exiting.");
                    System.exit(1);
                } 
                
                else {
                    System.out.println("You have successfully connected to your account.");
                    String r=(Account.list2).get(u);
                    if(r=="Admin"){
                        this.a=Adm.get(u);
                        this.ConsoleAdmin();
                        break;
                    }
        
                    else{
                        this.c=Cus.get(u);
                        this.ConsoleCustomer();
                        break;
                    }
                }
            
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(1);
        }
    }


    public void ConsoleAdmin(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome Admin");
        System.out.println("Type 1 to create a new product, type 0 to ban a user");
        int y = scanner.nextInt();
        switch(y){
            case 0:
                System.out.println("please type the name of the user you want to ban");
                String n=scanner.nextLine();
                (this.a).Ban(n);
            
            case 1:
                (this.a).CreateProduct();

        System.exit(0);
                

        }
    }

    public void ConsoleCustomer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Weclome customer");
        System.out.println("Type 1 to buy a product, type 0 to explore the categories we have");
        int z=scanner.nextInt();
        switch(z){
            case 1:
                System.out.println("Please type the id of the product you want to buy");
                int n=scanner.nextInt();
                (this.c).BuyProduct(n);

            case 0:
                System.out.println("we have toys and Electronics");
        }
        System.exit(0);
    }
}