/**
 *
 * @author ILUVATAR
 */

package CookieJar;

public class Cookie {
    private int flourQty, sugarQty, eggsQty, saltQty, fatQty, bakingPowderQty, waterQty;

    public Cookie() {
        flourQty = 0;
        sugarQty = 0;
        eggsQty = 0;
        saltQty = 0;
        fatQty = 0;
        bakingPowderQty = 0;
        waterQty = 0;
    }

    public Cookie(int flourQty, int sugarQty, int eggsQty, int saltQty, int fatQty, int bakingPowderQty, int waterQty) {
        this.flourQty = flourQty;
        this.flourQty = flourQty;
        this.sugarQty = sugarQty;
        this.eggsQty = eggsQty;
        this.saltQty = saltQty;
        this.fatQty = fatQty;
        this.bakingPowderQty = bakingPowderQty;
        this.waterQty = waterQty;
    }

    /**
     * @return the flourQty
     */
    public int getFlourQty() {
        return flourQty;
    }

    /**
     * @param flourQty the flourQty to set
     */
    public void setFlourQty(int flourQty) {
        this.flourQty = flourQty;
    }

    /**
     * @return the sugarQty
     */
    public int getSugarQty() {
        return sugarQty;
    }

    /**
     * @param sugarQty the sugarQty to set
     */
    public void setSugarQty(int sugarQty) {
        this.sugarQty = sugarQty;
    }

    /**
     * @return the eggsQty
     */
    public int getEggsQty() {
        return eggsQty;
    }

    /**
     * @param eggsQty the eggsQty to set
     */
    public void setEggsQty(int eggsQty) {
        this.eggsQty = eggsQty;
    }

    /**
     * @return the saltQty
     */
    public int getSaltQty() {
        return saltQty;
    }

    /**
     * @param saltQty the saltQty to set
     */
    public void setSaltQty(int saltQty) {
        this.saltQty = saltQty;
    }

    /**
     * @return the fatQty
     */
    public int getFatQty() {
        return fatQty;
    }

    /**
     * @param fatQty the fatQty to set
     */
    public void setFatQty(int fatQty) {
        this.fatQty = fatQty;
    }

    /**
     * @return the bakingPowderQty
     */
    public int getBakingPowderQty() {
        return bakingPowderQty;
    }

    /**
     * @param bakingPowderQty the bakingPowderQty to set
     */
    public void setBakingPowderQty(int bakingPowderQty) {
        this.bakingPowderQty = bakingPowderQty;
    }

    /**
     * @return the waterQty
     */
    public int getWaterQty() {
        return waterQty;
    }

    /**
     * @param waterQty the waterQty to set
     */
    public void setWaterQty(int waterQty) {
        this.waterQty = waterQty;
    }
}
