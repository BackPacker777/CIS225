package FileIODemo;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * For demonstrating file I/O in Java.
 * 
 * @author Howard Bates
 * @version 2.06.2012.01
 */
public class ReaderWriter {
    private BufferedWriter writer;
    private BufferedReader reader;
    private File fileIn;
    private Scanner dataReader;
    private String lastName;
    private String firstName;

    /**
     * Constructor for objects of class ReaderWriter
     */
    public ReaderWriter() {
        lastName = "";
        firstName = "";
    }
    
    public ReaderWriter(String fileName) {
        try {
            String line;
            this.reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] RowData = line.split(",");
                lastName = RowData[0];
                firstName = RowData[1];
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
        while (dataReader.hasNextLine()) {
            String line = dataReader.nextLine();
            String[] attributes = line.trim().split(",");
            lastName = attributes[0];
            firstName = attributes[1];
        }
        dataReader.close();
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void saveData(String outFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(lastName + "," + firstName);
            writer.flush();
            writer.close();
        } catch  (IOException e) {
            e.printStackTrace();
        }
    }
}