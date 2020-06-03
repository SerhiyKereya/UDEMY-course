package Lesson4;

import java.net.SocketOption;

public class BankAccount {
    // instance varyebels
    int id;
    String name;
    double balance;
}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();
        BankAccount herAccount = new BankAccount();

        myAccount.id = 12;
        myAccount.name = "Serhiy";
        myAccount.balance = 4.50;

        hisAccount = myAccount;
        herAccount.id = 1;
        herAccount.name = "Bee";
        herAccount.balance = 500;

        System.out.println(hisAccount.name);
        System.out.println("some BankAccount object in memory, without address link to reference variable - " + new BankAccount().name); //
    }
}