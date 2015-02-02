package Structure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author bates.he.z
 */
public class Location {
    private static final int DESCRIPTIONPOSITION = 2;
    private FileInputStream fileIn;
    private Scanner reader;
    private int move;
    private String[] placeData;
    private String placeDescription;
    private int[] moveChoices;
    private HashMap<Integer,ArrayList> places;
    private ArrayList<String> place;
    
    public Location(String fileName) throws FileNotFoundException {
        move = 1;
        place = new ArrayList<>();
        fileIn = new FileInputStream(fileName);
        reader = new Scanner(fileIn);
        places = new HashMap<>();
        prepPlaceData();
        //setPlaceDescription();
    }
    
    private void prepPlaceData() {
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            place.add(line.trim().split(":"));
            //placeData = line.trim().split(":");
            for (String item : placeData) {
                System.out.println(item);
            }
            //populatePlaces();
        }
        reader.close();
    }
    
    private void populatePlaces() {
        for (String item : placeData) {
            place.add(item);
            places.put(Integer.parseInt(placeData[0]),place);
        }
    }
            
    @Override
    public String toString() {
        return placeDescription;
    }

    /**
     * @return the move
     */
    public int getMove() {
        return move;
    }

    /**
     * @param move the move to set
     */
    public void setMove(int move) {
        this.move = move;
    }
    
    private void setPlaceDescription() {
        ArrayList<String> temp = places.get(move);
        placeDescription = temp.get(DESCRIPTIONPOSITION);
    }
}