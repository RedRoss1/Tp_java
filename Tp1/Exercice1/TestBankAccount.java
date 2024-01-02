package Exercice1;

public class TestBankAccount{
     public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(123456, "John Doe", 1000);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Account Holder Name: " + myAccount.getAccountHolderName());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.withdraw(800); // Attempting to withdraw more than the balance
}
} 
    
