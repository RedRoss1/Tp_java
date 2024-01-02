package ProductManagement;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Product{
    
    public int id; //a unique id for each product
    public String name; //the name of the product
    public float price; //the price of the product
    public static HashMap<Integer,Integer> i = new HashMap<>(); //this HashMap will represent the inventory, each key will be a product id and each value will tell us the quantity left
    public static HashMap<Integer,Float> pr=new HashMap<>(); //tghis HashMap will contain each product id as a key with its price as a value
    public HashMap<String,String> reviews;

    public Product(){
        Scanner scanner=new Scanner (System.in);

        this.reviews=new HashMap<>();

        System.out.println("enter the id of the product");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter the name of the product");
        this.name = scanner.nextLine();

        System.out.println("enter the price of the product");
        this.price = scanner.nextFloat();
        scanner.nextLine();

        if ((this.i).containsKey(this.id)){
            int n = (this.i).get(this.id);
            (this.i).replace(this.id,n+1);
        }

        else{
            (this.i).put(this.id,1);
        }

        (this.pr).put(this.id,this.price);
        System.out.println(this.i);
    }

    public abstract String getCategory();

}