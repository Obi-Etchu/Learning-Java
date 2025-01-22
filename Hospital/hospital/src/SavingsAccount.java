public class SavingsAccount extends BankAccount {

    double interestRate;


    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        //TODO Auto-generated constructor stub
        this.interestRate = interestRate;

        

        
    }


    public double getInterestRate() {
        return interestRate;
    }



    public void displayAccountInfo(){
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Account balance: " + getBalance());
        System.out.println("interest rate " + getInterestRate());
    }

    
}
