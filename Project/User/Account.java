package User;

import java.util.Scanner;
import java.util.HashMap;

public abstract class Account{
    public static HashMap <String,String> list = new HashMap<>(); //will contain each user's name as a key with their account's password as a value 
    public static HashMap <String,String> list2 = new HashMap<>(); //will contain each user's name as a key with their role as a value
    public String username;
    public String password;

    public Account(){

        Scanner scanner=new Scanner (System.in);

        //used for creating a username for the new account that will be created
        System.out.println("Please enter a username");
        this.username = scanner.nextLine();
            
        ////used for creating a valid password for the new account that will be created
        System.out.println("Please enter a paswword that contains a minimum of 8 caracters");
        this.password = scanner.nextLine();
        while((this.password).length()<=7){
            System.out.println("The password must contain a minimum of 8 caracters, otherwise it won't be valid");
            this.password = scanner.nextLine();            
        }
    }

    public abstract String GetRole();

}
