/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CookieJar;

/**
 *
 * @author ILUVATAR
 */
public class PeanutButterCookie extends Cookie{
    private static final String COOKIETYPE = "Peanut Butter";
    private int peanutButterQty, nutsQty, milkQty;
    
    public PeanutButterCookie() {
        super();
        peanutButterQty = 0;
        nutsQty = 0;
        milkQty = 0;
    }
    
    public PeanutButterCookie(int flourQty, int sugarQty, int eggsQty, int saltQty, int fatQty, int bakingPowderQty, int waterQty, int peanutButterQty, int nutsQty, int milkQty) {
        super(flourQty, sugarQty, eggsQty, saltQty, fatQty, bakingPowderQty, waterQty);
        this.peanutButterQty = peanutButterQty;
        this.nutsQty = nutsQty;
        this.milkQty = milkQty;
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
                "Peanut butter: " + getPeanutButterQty() + "\n" +
                "Nuts: " + getNutsQty() + "\n" +
                "Milk: " + getMilkQty() + "\n";
    }

    /**
     * @return the peanutButterQty
     */
    public int getPeanutButterQty() {
        return peanutButterQty;
    }

    /**
     * @param peanutButterQty the peanutButterQty to set
     */
    public void setPeanutButterQty(int peanutButterQty) {
        this.peanutButterQty = peanutButterQty;
    }

    /**
     * @return the nutsQty
     */
    public int getNutsQty() {
        return nutsQty;
    }

    /**
     * @param nutsQty the nutsQty to set
     */
    public void setNutsQty(int nutsQty) {
        this.nutsQty = nutsQty;
    }

    /**
     * @return the milkQty
     */
    public int getMilkQty() {
        return milkQty;
    }

    /**
     * @param milkQty the milkQty to set
     */
    public void setMilkQty(int milkQty) {
        this.milkQty = milkQty;
    }
}
