/**
 * @author hbates@northmen.org
 * @version 02.10.2014.01
 * ASSIGNMENT: Enums
 * PURPOSE: Demonstrate Enums
 */

package Money;

public class Currency {
    private int coinType;
    private Coins dime;
    private enum Coins {
        PENNY(1), NICKEL(5), DIME(10), QUARTER(25), HALFDOLLAR(50);
        private int coinType;
        
        private Coins(int coinType) {
            this.coinType = coinType;
        }
        
        public int getCoinType() {
            return coinType;
        }
    }
    
    public Currency() {
        dime = Coins.DIME;
        printCoinValue();
        printCoinValue2();
        printCoinValue3();
        printCoinTypes();
    }
    
    public static void main(String[] args) {
        new Currency();
    }
    
    public void printCoinValue() {
        System.out.println(dime.getCoinType());
    }
    
    public void printCoinValue2() {
        System.out.println("COIN VALUE: " + Currency.Coins.DIME.getCoinType());
    }
    
    public void printCoinValue3() {
        Coins nickel = Coins.NICKEL;
        switch (nickel.getCoinType()) {
            case 1:
                System.out.println("This is not a Penny!");
                break;
            case 5:
                System.out.println("Correct!");
                break;
        }
    }
    
    public void printCoinTypes() {
        for (Currency.Coins coin : Currency.Coins.values()) {
            System.out.println("Coin: " + coin);
        }
    }
}
