/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

public class HelloKitty {
    private Test chair;
    
    public HelloKitty() {
        System.out.println("Welcome message!");
    }
    
    public void makeChair() {
        chair = new Test();
    }
    
    public void makeChair(String color, int numWheels) {
        chair = new Test(color, numWheels);
    }
    
    public int getNumWheels() {
        return chair.getNumWheels();
    }
    
    public String getColor() {
        return chair.getColor();
    }
}
