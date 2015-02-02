package AtmDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class AtmInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AtmInterface
{
    private CustomerData customer;
    private ArrayList<CustomerData> customers;
    private Iterator<CustomerData> finder;

    /**
     * Constructor for objects of class AtmInterface
     */
    public AtmInterface() {
        customers = new ArrayList<CustomerData>();
        finder = customers.iterator();
    }
    
    /**
     * Method addCustomers
     *
     * @param customer (Acts like a datbase connector).
     */
    public void addCustomers(CustomerData customer) {
        customers.add(customer);
    }
    
    /**
     * Method validateCustomer
     *
     * @param pin A parameter
     * @param cardNumber A parameter
     */
    public void validateCustomer(int pin, int cardNumber) {
        final int MAXTRIES = 4;
        int tryCount = 0;
        for(CustomerData customer : customers) {
            if (pin == customer.getPinNumber() && cardNumber == customer.getCardNumber()) {
                System.out.println("Welcome to our bank!");
                return;
            } else {
                System.out.println("Wrong PIN number. Please try again.");
                tryCount++;
                if (tryCount > MAXTRIES) {
                    System.out.println("Too many incorrect attempts. Confiscating card, please contact your bank. NOW!");
                    System.exit(-1);
                }
            }
        }
    }
    
    /**
     * Method printCustomers
     *
     */
    public void printCustomers() {
        finder = customers.iterator();
        while (finder.hasNext()) {
            customer = finder.next();
            System.out.println("Last Name: " + customer.getLastName());
            System.out.println("First Name: " + customer.getFirstName());
            System.out.println("Account balance: " + customer.getAccount().getBalance());
            System.out.println("Account number: " + customer.getAccount().getAccountNumber());
        }
    }
    
    public void makeDeposit(int accountNumber, int amount) {
        for(CustomerData customer : customers) {
            if (accountNumber == customer.getAccount().getAccountNumber()) {
                customer.getAccount().performDeposit(amount);
                return;
            }
        }
        System.out.println("You do not have that account type, please try again.");
    }
    
    /**
     * Method makeWithdrawal
     *
     * @param accountNumber A parameter
     * @param amount A parameter
     */
    public void makeWithdrawal(int accountNumber, int amount) {
        for(CustomerData customer : customers) {
            if (accountNumber == customer.getAccount().getAccountNumber()) {
                customer.getAccount().performWithdrawal(amount);
                return;
            }
        }
        System.out.println("You do not have that account type, please try again.");
    }
    
    /**
     * Method transferFunds
     *
     * @param fromAccountNumber A parameter
     * @param toAccountNumber A parameter
     * @param amount A parameter
     */
    public void transferFunds(int fromAccountNumber, int toAccountNumber, int amount) {
        for(CustomerData customer : customers) {
            if (fromAccountNumber == customer.getAccount().getAccountNumber() && toAccountNumber == customer.getAccount().getAccountNumber()) {
                makeWithdrawal(fromAccountNumber, amount);
                makeDeposit(toAccountNumber, amount);
            }
        }
    }
    
    /**
     * Method getBalance
     *
     * @param accountNumber A parameter
     * @return The return value
     */
    public int getBalance(int accountNumber) {
        int balance;
        for(CustomerData customer : customers) {
            if (accountNumber == customer.getAccount().getAccountNumber()) {
                return balance = customer.getAccount().getBalance();
            }
        }
        System.out.println("You do not have that account type, please try again.");
        return 0;
    }
}