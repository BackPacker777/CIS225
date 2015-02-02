/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    public int getPrice()
    {
        return price;
    }

    public int getBalance()
    {
        return balance;
    }

    public void insertMoney(int amount)
    {
        balance = balance + amount;
        dontLookAtMe();
    }

    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    private void dontLookAtMe() {
        System.out.print("I said don't look at me!!!!!!!!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
