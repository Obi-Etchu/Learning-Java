public class BankAccount {

    //Private attributes
    private String accountNumber;
    private double accountBalance;
    private String accountName;

    //Constructor
    public  BankAccount(String accountNumber, double accountBalance, String accountName){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    //Method to deposit
    public void Deposit(double amount){
        if(amount >= 0){
            accountBalance += amount;
            System.out.println("Deposit successful. You deposited "+ amount);
        }else{
            System.out.println("Deposit unsuccessful. Invalid amount");
        }
    }

    //Method to withdraw
    public void Withdraw(double amount){
        if(amount > 0 && amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("Withdrawal successful. You withdrew: " + amount);
        }else{
            System.out.println("Withdrawal unsuccessful");
        }

    }

    //Method for balance inquiry
    public double Balance(){
        return accountBalance;
    }

    //Getters for attributes
    public String getAccountName(){
        return accountName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    //Setters for attributes
    public void setAccountName(String accountName){
        this.accountName = accountName; 
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("683172718", 1000000, "Obi Junior");
        System.out.println("Account name: " + account.accountName);
        System.out.println("Account number: "+ account.accountNumber);
        System.out.println("Account balance: "+ account.accountBalance);
        //Depositing
        account.Deposit(7000);
        System.out.println("New balance: " + account.getAccountBalance());
        //Withdrawing
        account.Withdraw(5000);
        System.out.println("New balance: "+ account.getAccountBalance());
        //Balance inquiry
        account.Balance();
        System.out.println("Balance: "+ account.getAccountBalance());
    }
    
}