package TestEnum;

import java.util.HashMap;

/**
 * Description of class UseDaysWeek.
 * 
 * @author (Howard E. Bates, hbates@northmen.org) 
 * @version (0.0.2012.01)
 */
public class UseDaysWeek {
    private HashMap<String, DaysWeek> validDays;
    private DaysWeek day;
    private String currentDay;

    /**
     * Constructor for objects of class UseDaysWeek
     */
    public UseDaysWeek() {
        currentDay = "";
        validDays = new HashMap<String, DaysWeek>();
        for (DaysWeek day : DaysWeek.values()) {
            validDays.put(day.toString(), day);
        }
    }
    
    public void setCurrentDay(String currentDay) {
        if (!validDays.containsKey(currentDay)) {
            System.out.println("INVALID DAY ENTERED.");
        } else {
            day = validDays.get(currentDay);
        }
    }
     
    public void printDay() {
        System.out.println("Current day: " + day);
    } 
}