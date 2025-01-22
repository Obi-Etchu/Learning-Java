abstract class BankAccount {

    String accountNumber;
    double balance;
  
  
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (double amount){
        balance+=amount;
    }

    public void withdraw (double amount){
        balance-=amount;
    }

    public void displayAccountInfo (){}

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    


    



}