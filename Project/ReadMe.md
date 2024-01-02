in my implementation of the e-commerce platform, i used 3 packages:

(1) The package "ProductManagement":
    This package contains 3 classes and its goal is to manage the inventory and all the products.

    -First class "Product":

    //Attributes:
    This class is an abstract class representing a product with its unique id, its name, its price and its reviews (using a hashmap<String,String>, each key
    will be a username and each value will be the review written by the user).
    Furthermore, the class "product" has 2 static hashmaps:
    the first one called "i" and used to represent the inventory : each key will be a product id and each value will tell us the quantity left
    the second one called ""pr is used later in the "BuyProduct" method (it is a method of the class "Customer), each key of nthis hashmap will be a product id and each value will be its price.

    //Methods:
    This class has only one abstract method called "getCategory" and it it's used to determine the category of a certain product in it subclasses

    -Second class "ToyProduct":
    It is a subclass of the class "Product",it represents toys and it doesn't have any attributes other than those of the class "Product"

    -Third class "ElectronicsProduct":
    It is a subclass of the class "Product", it represents electronics and it doesn't have any attributes other than those of the class "Product"

    -The fourth file of this package is used to test all of the methods of the classes menyioned before

(2) The package "User":
    This package is used to represent the users of this platform(Customers/Admins), and it has 3 main classes:

    -First class "Account":
    
    //Attributes:
    It is an abstract class used to represent an account using a username and a password
    In addition, I implemented 2 static hashmaps : list and list2

    -"list" is a <String,String> hashmap, each one of its keys is a username and each one of its values is the password corresponding to the username, this hashmap will be used later in the login System.

    -list2 is a <String,String> hashmap, each one of its keys is a username and each one of its values is the role corresponding to the username

    //Methods:
    This class only has one abstract method that is implemented in its subclasses, it will return "Admin" in the "Admin" subclass and "Customer" in the Customer subclass

    -Second class "Admin":

    //Attributes:
    this class is a subclass of the class "Account", it only has one additional attribute which is "AdminCode" (static) that will be used when someone tries to create an Admin account

    //Methods:
    This class has 3 methods : 
        + "CreateProduct" that allows an Admin to create a new product by adding it and its quantity to the hashmap i(static in the class "Product") that represents the inventory

        + "GetRole" that returns "Admin"

        + "Ban" that allows each admin to permanently ban a customer from the platform by removing its name from all the hashmaps containing usernames, that way they will never be able to login again

    -Third class "Customer":

    //Attributes:
    This class is a subclass of the class "Account", its additional attributs are "BankAccount b" to represent the customer's bank account, "Cart c" to represent their shopping cart, and "Order o" to keep track of their orders , who are represented by classes that i created in the "Customer" Subpackage

    //Methods:
    This class has 3 methods:

    +BuyProduct: that allows a customer to buy a product after checking its bank account balance

    +review: that allows a customer to review a product by adding the review with the customer's username in the "review" attribute of the product mentioned before

    +GetRole: that returns "Customer"

(3) The package "ConsoleManagement":
    This package has one class "Console" (the file TestConsole is used for testint its methods)

    -The class "Console":

    //Attributes:
    This class has 2 static hashmaps,
    the first one "Adm" is used for storing all of of the Admin usernames as keys and a reference to each one's account as a value,
    the second one "Cus" is used for storing all of of the Customer usernames as keys and a reference to each one's account as a value,


    //Methods:
    This class has three methods:

    +"start" this method is the starting point of the console, its used for logging in or creating new accounts, then it calls either "ConsoleAdmin" if the user who (logged in / signed up) is an admin or "ConsoleCustomer" if the user who (logged in / signed up) is a customer

    +"ConsoleAdmin" that allows each admin either to create new products or ban customers 

    +"ConsoleCustomer" that allows each customer to explore and buy products 
        








