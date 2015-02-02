package Denizens;

/**
 *
 * @author bates.he.z
 */
public class Ghoul extends Denizen {
    private int undeadPower;
    
    public Ghoul(int size, String name, int undeadPower) {
        super(size, name);
        this.undeadPower = undeadPower;
    }
    
    @Override
    public String toString() {
        return "Undead power: " + undeadPower + "\n" +
                "Size: " + getSize() + "\n" +
                "Name: " + getName();
    }

    /**
     * @return the undeadPower
     */
    public int getUndeadPower() {
        return undeadPower;
    }

    /**
     * @param undeadPower the undeadPower to set
     */
    public void setUndeadPower(int undeadPower) {
        this.undeadPower = undeadPower;
    }
}