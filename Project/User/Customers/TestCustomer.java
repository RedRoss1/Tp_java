package User.Customers;

import ProductManagement.ElectronicsProduct;
import ProductManagement.Product;
import ProductManagement.ToyProduct;

public class TestCustomer {

    public static void main(String[] args) {
        // Creating a sample product
        Product laptop = new ElectronicsProduct();

        // Creating a customer
        Customer customer = new Customer();

        // Displaying the customer's role
        System.out.println("Customer Role: " + customer.GetRole());

        // Adding a product to the cart
        customer.c.AddToCart(laptop);
        System.out.println("Product added to the cart.");

        
        // Buying the product
        customer.BuyProduct(laptop.id);
        System.out.println("Product purchased.");

        // Reviewing the product
        customer.review(laptop);
        System.out.println("Review added.");

        // Displaying the bank account balance after purchase
        System.out.println("Bank Account Balance: " + customer.b.solde);
    }
}