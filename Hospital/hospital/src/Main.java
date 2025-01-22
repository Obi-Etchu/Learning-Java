import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        ArrayList<BankAccount> accounts= new ArrayList<>();
        SavingsAccount a = new SavingsAccount("SA001", 1000, 500);
       CheckingAccount b = new CheckingAccount("CA001", 200, 500);
 
       accounts.add(a);
       accounts.add(b);
       for (BankAccount account: accounts) {
        double depositAmount  = random.nextDouble() * 1000;

        account.deposit(depositAmount);
        System.out.println("Deposited " + depositAmount + " into account " + account.getAccountNumber());
        double withdrawalAmount = random.nextDouble()*500;
        account.withdraw(withdrawalAmount);

        System.out.println("Withdrawn " + withdrawalAmount + " from account " + account.getAccountNumber());
         account.displayAccountInfo();
         System.out.println();
       }
}
}