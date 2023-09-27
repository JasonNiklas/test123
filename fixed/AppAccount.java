package fixed;

public class AppAccount {

    public static void main(String[] args) {
        Account myAccount = new Account(100.0); 
        double balance = myAccount.get(); 
        System.out.println("Kontostand: " + balance);
        myAccount.multiply(1.05); 
        balance = myAccount.get(); 
        System.out.println("Aktualisierter Kontostand: " + balance);
        
        Account myAccount2 = new Account(500.95);
        double balance2 = myAccount2.get();
        System.out.println("Kontostand: " + balance2);
        myAccount2.deposit(2345.99);
        balance2 = myAccount2.get();        
        System.out.println("Aktualisierter Kontostand: " + balance2);        
    }
}