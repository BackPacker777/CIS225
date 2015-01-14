/**
 * @author (your name) 
 * @version (a version number or a date)
 */

package SchoolBuilding;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}