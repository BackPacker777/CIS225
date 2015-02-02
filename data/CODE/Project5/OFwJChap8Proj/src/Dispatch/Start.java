package Dispatch;

import Denizens.Denizen;
import Denizens.Ghoul;
import Denizens.Orc;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bates.he.z
 */
public class Start {
    private ArrayList<Denizen> denizens;
    private Scanner dataReader;
    private File fileIn;
    private String fileName;
    private String[] attributes;
    private Denizen orc, ghoul;

    public Start(String fileName) {
        this.fileName = fileName;
        denizens = new ArrayList<>();
        fileIn = new File(fileName);
        try {
            dataReader = new Scanner(fileIn);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        populateAttributes();
        printDenizens();
        dataReader.close();
    }

    public static void main(String[] args) {
        final String FILENAME = "Z:/NCMC/225/code/OFwJChap8Proj/src/Dispatch/DataFile.csv";
        Start start = new Start(FILENAME);
    }

    private void populateAttributes() {
        while (dataReader.hasNextLine()) {
            String line = dataReader.nextLine();
            attributes = line.trim().split(",");
            populateDenizens();
        }
    }

    private void populateDenizens() {
        int denizenType = Integer.parseInt(attributes[0]);
        if (denizenType == 0) {
            denizens.add(orc = new Orc(Integer.parseInt(attributes[1]), attributes[2], Integer.parseInt(attributes[3])));
        } else {
            denizens.add(ghoul = new Ghoul(Integer.parseInt(attributes[1]), attributes[2], Integer.parseInt(attributes[3])));
        }
    }
    
//    private void printDenizens() {
//        for (Denizen denizen : denizens) {
//            System.out.println("Name: " + denizen.getName());
//            System.out.println("Size: " + denizen.getSize());
//        }
//    }
    private void printDenizens() {
        for (Denizen denizen : denizens) {
            System.out.println(denizen);
        }
    }
}