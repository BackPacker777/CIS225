/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Test {
    private String color;
    private int numWheels;
    private final int DEFAULT_WHEELS = 5;
    private final String DEFAULT_COLOR = "Blue";
    
    public Test() {
        color = DEFAULT_COLOR;
        numWheels = DEFAULT_WHEELS;
    }
    
    public Test(String color, int numWheels) {
        this.color = color;
        this.numWheels = numWheels;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    
    public int getNumWheels() {
        return numWheels;
    }    
}
