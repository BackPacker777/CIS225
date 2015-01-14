/**
 * @author (your name) 
 * @version (a version number or a date)
 */

package SchoolBuilding;

public class Chair {
    private String color;
    private boolean hasWheels;

    public Chair(String color, boolean hasWheels) {
        this.color = color;
        this.hasWheels = hasWheels;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public boolean getHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }
}
