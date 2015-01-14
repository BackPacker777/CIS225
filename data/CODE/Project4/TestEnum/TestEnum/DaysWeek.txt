package TestEnum;

/**
 * Enumeration class DaysWeek - write a description of the enum class here
 * 
 * @author (Howard E. Bates)
 * @version (0.0.2012.01)
 */
public enum DaysWeek {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");
    
    private String day;
    
    DaysWeek(String day) {
        this.day = day;
    }
    
    public String toString() {
        return day;
    }
}