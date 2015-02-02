package AtmDemo;

import java.util.ArrayList;

/**
 * Write a description of class CustomerData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerData {
    private int cardNumber, pinNumber, checkingStartBalance, savingsStartBalance, accountNumber;
    private String lastName, firstName;
    private BankAccount account;
    private ArrayList<BankAccount> accounts;
    private static final int CHECKING = 1, SAVINGS = 2;
    
    /**
     * Constructor for objects of class CustomerData
     */
    public CustomerData(int cardNumber, int pinNumber, String lastName, String firstName, int checkingAccountNumber, int checkingStartBalance, int savingsAccountNumber, int savingsStartBalance)
    {
        this.cardNumber = cardNumber;
        this.pinNumber = pinNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        accounts = new ArrayList<BankAccount>();
        if (checkingStartBalance > 0) {
            accounts.add(account = new BankAccount(CHECKING, checkingAccountNumber, checkingStartBalance));
        }
        if (savingsStartBalance > 0) {
            accounts.add(account = new BankAccount(SAVINGS, savingsAccountNumber, savingsStartBalance));
        }
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }
    
    public int getPinNumber() {
        return pinNumber;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public BankAccount getAccount(int checkingAccount, int savingsAccount) { //add iteration here to supply account info out of ArrayList
        return account;
    }
}