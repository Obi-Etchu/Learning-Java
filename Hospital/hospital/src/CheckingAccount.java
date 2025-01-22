public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        //TODO Auto-generated constructor stub

        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    

    public void withdraw(double amount){
    if(amount > getBalance() + overdraftLimit){
        System.out.println(" insufficient funds");
    }
    else{
        super.withdraw(amount);
    }
    }
    

}