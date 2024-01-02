package User.Customers;

import ProductManagement.Product;
import User.Account;

import java.util.Scanner;

public class Customer extends Account {
    public BankAccount b;
    protected Cart c;
    protected Order o;

    public Customer(){
        super();
        (this.list).put(this.username, this.password);
        (this.list2).put(this.username, "Customer");
        b=new BankAccount();
        c=new Cart();
        o=new Order();
    }

    public void BuyProduct(int p){
        Scanner scanner= new Scanner(System.in);
        int n= (Product.i).get(p);
        if(n==0){
            System.out.println("sorry this product is out of stock");
        }
        else{
            float s= b.solde;
            float prix=(Product.pr).get(p);
            if (prix>s){
                System.out.println("sorry your balance isn't sufficient to buy this product");
            }
            else{
                b.solde=b.solde-prix;
                (Product.i).replace(p,n--);
                o.AddOrder(p,prix);
                }
        }
    }



    public void  review (Product p){ //First Additional Feature (Reviews)
        System.out.println("you can write your review here :");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String n=this.username;
        (p.reviews).put(n,s);

    }

    public String GetRole(){
        return "Customer";
    }
}
