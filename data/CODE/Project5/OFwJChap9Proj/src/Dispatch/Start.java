package Dispatch;

import Structure.Location;
import java.io.FileNotFoundException;

/**
 *
 * @author bates.he.z
 */
public class Start {
    private Location place;
    
    public Start(String fileName) throws FileNotFoundException {
        place = new Location(fileName);
        //printDescription();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        final String FILENAME = "Z:\\NCMC\\225\\code\\OFwJChap9Proj\\src\\Structure\\Rooms.csv";
        Start start = new Start(FILENAME);
    }
    
    private void printDescription() {
        System.out.println(place);
    }
}