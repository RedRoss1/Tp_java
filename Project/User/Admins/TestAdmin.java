package User.Admins;

import ProductManagement.ElectronicsProduct;
import ProductManagement.Product;
import ProductManagement.ToyProduct;
import User.Account;
import User.Customers.Customer;
import ConsoleManagement.Console;

public class TestAdmin {

    public static void main(String[] args) {
        // Creating an admin
        Admin admin = new Admin();

        // Displaying the admin's role
        System.out.println("Admin Role: " + admin.GetRole());

        // Creating a new product (Toy)
        System.out.println("Creating a new Toy product:");
        admin.CreateProduct();

        // Creating a new product (Electronics)
        System.out.println("Creating a new Electronics product:");
        admin.CreateProduct();

        // Creating a sample customer
        Customer customer = new Customer();

        // Displaying the initial list of users
        System.out.println("Initial List of Users: " + Account.list2);

        // Banning the customer
        admin.Ban(customer.username);
        System.out.println("Customer banned.");

        // Displaying the updated list of users
        System.out.println("Updated List of Users: " + Account.list2);
    }
}