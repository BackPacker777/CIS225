package Denizens;

/**
 *
 * @author bates.he.z
 */
public abstract class Denizen {
    private int size;
    private String name;
    
    public Denizen(int size, String name) {
        this.size = size;
        this.name = name;
    }
    
    @Override
    public abstract String toString();

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}