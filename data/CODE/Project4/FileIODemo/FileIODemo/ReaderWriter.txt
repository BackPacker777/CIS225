/**
 * For demonstrating file I/O in Java.
 * 
 * @author Howard Bates
 * @version 2.06.2012.01
 */

package FileIODemo;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReaderWriter {
    private BufferedWriter writer;
    private BufferedReader reader;
    private File fileIn;
    private Scanner dataReader;
    private String[][] names;
    private PrintStream printOut;
    private final int COLUMNS = 2;
    
    public ReaderWriter(String fileName) {
        names = new String[5][2];
        int counter = 0;
        try {
            String line;
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(",");
                names[counter][0] = rowData[0];
                names[counter][1] = rowData[1];
                counter++;
            }
            reader.close();
        } catch  (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void differentReader(String fileName) {
        fileIn = new File(fileName);
        try {
            dataReader = new Scanner(fileIn);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }
    
    public void populateData() {
        int counter = 0;
        while (dataReader.hasNextLine()) {
            String line = dataReader.nextLine();
            String[] rowData = line.split(",");
            names[counter][0] = rowData[0];
            names[counter][1] = rowData[1]; 
            counter++;
        }
        dataReader.close();
    }
    
    public void printNames() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Last name: " + names[i][0] + ", First name: " + names[i][1]);                
        }
    }
    
    public void saveData(String outFile) {
        try {
            writer = new BufferedWriter(new FileWriter(outFile));
            for (int i = 0; i < names.length; i++) {
                writer.write(names[i][0] + "," + names[i][1]);
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch  (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void differentSaveData(String outFile) {
        try {
            printOut = new PrintStream(outFile);
            for (int i = 0; i < names.length; i++) {
                printOut.println(names[i][0] + "," + names[i][1]);
            }
            printOut.flush();
            printOut.close();
        } catch  (IOException e) {
            e.printStackTrace();
        }
    }
}