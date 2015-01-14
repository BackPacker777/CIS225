package Eater;

import CookieJar.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ILUVATAR
 */
public class CookieEater {
    private ArrayList<Cookie> plate;
    private Cookie cookie;
    private File fileReader;
    private Scanner streamReader;
    
    public CookieEater(String fileName) throws FileNotFoundException {
        plate = new ArrayList<>();
        fileReader = new File(fileName);
        streamReader = new Scanner(fileReader);
        readData();
        streamReader.close();
        printCookies();
    }
    
    private void readData() {
        String[] data;
        while (streamReader.hasNextLine()) {
            String line = streamReader.nextLine();
            data = line.trim().split(",");
            populatePlate(data);
        }
    }
    
    private void populatePlate(String[] data) {
        final int PEANUTBUTTER = 0;
        final int OATMEALRAISIN = 1;
        final int CHOCOLATECHIP = 2;
        int cookieType = Integer.parseInt(data[0]);
        int cookieQty = Integer.parseInt(data[1]);
        for (int i = 0; i < cookieQty; i++) {
            switch (cookieType) {
                case PEANUTBUTTER:
                    plate.add(cookie = new PeanutButterCookie());
                    break;
                case OATMEALRAISIN:
                    plate.add(cookie = new OatmealRaisinCookie());
                    break;
                case CHOCOLATECHIP:
                    plate.add(cookie = new ChocolateChipCookie());
                    break;
                default:
                    System.out.println("INVALID COOKIE!");
                    System.exit(1);
            }
        }
    }
    
    private void printCookies() {
        for (int i = 0; i < plate.size(); i++) {
            System.out.println(plate.get(i));
        }
    }
    
    public static void main(String[] args)  throws FileNotFoundException {
        final String FILENAME = "Z:\\NCMC\\225\\code\\Cookies2\\src\\Eater\\CookieData.csv";
        CookieEater person = new CookieEater(FILENAME);
    }
}
