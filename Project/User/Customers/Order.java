package User.Customers;

import ProductManagement.Product;

import java.util.HashMap;

public class Order {
    protected HashMap <Integer,Float> o;//Keys: id of a product, Values: its price

    public Order(){
        o=new HashMap<>();
    }

    public void AddOrder(int id, float pr){
        this.o.put(id,pr);
    }
    

}
