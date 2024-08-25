import java.util.*;

class Account{
    int balance = 500;
    Account(){
        System.out.println("Welcone User");
        System.out.println("Your Account open with Rs 500 balances");
    }

    Account(int bal){
        balance = bal;
        System.out.println("Welcone User");
        System.out.println("Your Account open with Rs " + balance);
    }
}

public class Main{
    public static void main(String []args){
        System.out.println("---------------------------------");
        Account obj = new Account();
        System.out.println("Object 1 balance = " + obj.balance);

        System.out.println("---------------------------------");
        Account obj2 = new Account(7000);
        System.out.println("Object 1 balance = " + obj2.balance);

        obj2.balance = obj2.balance + 5000;
        System.out.println("Object 1 balance = " + obj2.balance);

        System.out.println("---------------------------------");
        Account obj3 = new Account(10000);
        obj3.balance -= 4000;
        System.out.println("Object 1 balance = " + obj3.balance);

        System.out.println("---------------------------------");
    }
}