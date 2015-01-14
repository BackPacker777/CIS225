package CookieJar;

/**
 *
 * @author ILUVATAR
 */
public class OatmealRaisinCookie extends Cookie{
    private static final String COOKIETYPE = "Oatmeal Raisin";
    private int oatmealQty, raisinQty;
    
    public OatmealRaisinCookie() {
        super();
        oatmealQty = 0;
        raisinQty = 0;
    }
    
    public OatmealRaisinCookie(int flourQty, int sugarQty, int eggsQty, int saltQty, int fatQty, int bakingPowderQty, int waterQty, int oatmealQty, int raisinQty) {
        super(flourQty, sugarQty, eggsQty, saltQty, fatQty, bakingPowderQty, waterQty);
        this.oatmealQty = oatmealQty;
        this.raisinQty = raisinQty;
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
                "Oatmeal: " + getOatmealQty() + "\n" +
                "Raisins: " + getRaisinQty() + "\n";
    }

    /**
     * @return the oatmealQty
     */
    public int getOatmealQty() {
        return oatmealQty;
    }

    /**
     * @param oatmealQty the oatmealQty to set
     */
    public void setOatmealQty(int oatmealQty) {
        this.oatmealQty = oatmealQty;
    }

    /**
     * @return the raisinQty
     */
    public int getRaisinQty() {
        return raisinQty;
    }

    /**
     * @param raisinQty the raisinQty to set
     */
    public void setRaisinQty(int raisinQty) {
        this.raisinQty = raisinQty;
    }
}