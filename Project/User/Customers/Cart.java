package User.Customers;

import java.util.HashMap;

import ProductManagement.Product;

public class Cart {
    protected HashMap <String,Integer> c;//Keys: product name, Values: its quantity

    public Cart(){
        this.c=new HashMap();
    }

    public void  AddToCart(Product p){
        String s=p.name;
        (this.c).putIfAbsent(s,1);
    }

    public void RemoveFromCart(Product p){
        String s = p.name;
        (this.c).remove(s);
    }
}
