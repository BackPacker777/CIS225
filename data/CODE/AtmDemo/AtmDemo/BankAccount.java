package AtmDemo;

/**
 * Write a description of class BankAccounts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber, balance;
    private int accountType; //0=checking, 1=savings

    /**
     * Constructor for objects of class BankAccounts
     */
    public BankAccount(int accountType, int accountNumber, int balance)
    {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    /**
     * Method performDeposit
     *
     * @param deposit A parameter
     */
    public void performDeposit(int amount) {
        balance += amount;
    }
    
    /**
     * Method performWithdrawl
     *
     * @param withdrawl A parameter
     */
    public void performWithdrawal(int amount) {
        balance -= amount;
    }
    
    /**
     * Method getBalance
     *
     * @return The return value
     */
    public int getBalance() {
        return balance;
    }
    
    /**
     * Method getAccountType
     *
     * @return The return value
     */
    public int getAccountType() {
        return accountType;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
}