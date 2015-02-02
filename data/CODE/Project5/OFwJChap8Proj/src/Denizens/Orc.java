package Denizens;

/**
 *
 * @author bates.he.z
 */
public class Orc extends Denizen {
    private int tribeNumber;
    
    public Orc(int size, String name, int tribeNumber) {
        super(size, name);
        this.tribeNumber = tribeNumber;
    }
    @Override
    public String toString() {
        return "Tribe number: " + tribeNumber + "\n" +
                "Size: " + getSize() + "\n" +
                "Name: " + getName();
    }

    /**
     * @return the tribeNumber
     */
    public int getTribeNumber() {
        return tribeNumber;
    }

    /**
     * @param tribeNumber the tribeNumber to set
     */
    public void setTribeNumber(int tribeNumber) {
        this.tribeNumber = tribeNumber;
    }
}