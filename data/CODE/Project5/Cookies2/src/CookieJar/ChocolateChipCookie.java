package CookieJar;

/**
 *
 * @author ILUVATAR
 */
public class ChocolateChipCookie extends Cookie {
    private static final String COOKIETYPE = "Chocolate Chip";
    private int chocolateChipsQty, brownSugarQty;
    
    public ChocolateChipCookie() {
        super();
        chocolateChipsQty = 0;
        brownSugarQty = 0;
    }
    
    public ChocolateChipCookie(int flourQty, int sugarQty, int eggsQty, int saltQty, int fatQty, int bakingPowderQty, int waterQty, int chocolateChipsQty, int brownSugarQty) {
        super(flourQty, sugarQty, eggsQty, saltQty, fatQty, bakingPowderQty, waterQty);
        this.chocolateChipsQty = chocolateChipsQty;
        this.brownSugarQty = brownSugarQty;
    }
    
    @Override
    public String toString() {
        return "Cookie type: " + COOKIETYPE + "\n" +
                "Flour: " + getFlourQty() + "\n" +
                "Sugar: " + getSugarQty() + "\n" +
                "Eggs: " + getEggsQty() + "\n" +
                "Salt: " + getSaltQty() + "\n" +
                "Fat: " + getFatQty() + "\n" +
                "Baking Powder: " + getBakingPowderQty() + "\n" +
                "Chocolate Chips: " + getChocolateChipsQty() + "\n" +
                "Brown Sugar: " + getBrownSugarQty() + "\n";
    }

    /**
     * @return the chocolateChipsQty
     */
    public int getChocolateChipsQty() {
        return chocolateChipsQty;
    }

    /**
     * @param chocolateChipsQty the chocolateChipsQty to set
     */
    public void setChocolateChipsQty(int chocolateChipsQty) {
        this.chocolateChipsQty = chocolateChipsQty;
    }

    /**
     * @return the brownSugarQty
     */
    public int getBrownSugarQty() {
        return brownSugarQty;
    }

    /**
     * @param brownSugarQty the brownSugarQty to set
     */
    public void setBrownSugarQty(int brownSugarQty) {
        this.brownSugarQty = brownSugarQty;
    }
}