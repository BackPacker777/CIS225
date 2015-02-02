/**
 * @author hbates@northmen.org
 * @version 02.10.2014.01
 * ASSIGNMENT: Looping
 * PURPOSE: Demonstrate looping
 */

import java.util.ArrayList;

public class Classroom {
    private Chair[] seats;
    private ArrayList<Human> students, teachers;
    private int counter;
    
    public Classroom(int numChairs) {
        counter = 0;
        seats = new Chair[numChairs];
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void makePerson(int personType, int age, String name) {
        final int STUDENT = 0;
        if (personType == STUDENT) {
            students.add(new Human(age, name));
        } else {
            teachers.add(new Human(age, name));
        }
    }

    public void makeChair(String color) {
        seats[counter] = new Chair(color);
        counter++;
    }

    public int getPersonAge(int personType, int person) {
        final int STUDENT = 0;
        if (personType == STUDENT) {
            return students.get(person).getAge();
        } else {
            return teachers.get(person).getAge();
        }
    }

    public String getPersonName(int personType, int person) {
        final int STUDENT = 0;
        if (personType == STUDENT) {
            return students.get(person).getName();
        } else {
            return teachers.get(person).getName();
        }
    }

    public void removeHuman(int personType, int whichPerson) {
        final int STUDENT = 0;
        if (personType == STUDENT) {
            students.remove(whichPerson);
        } else {
            teachers.remove(whichPerson);
        }

    }

    public void removeHuman(int personType, String personName) {
        final int STUDENT = 0;
        if (personType == STUDENT) {
            for (Human student : students) {
                if (student.getName().equals(personName)) {
                    students.remove(student);
                }
            }
        } else {
            for (Human teacher : teachers) {
                if (teacher.getName().equals(personName)) {
                    teachers.remove(teacher);
                }
            }
        }
    }

    public void listPeople(int personType) {
        final int STUDENT = 0;
        if (personType == STUDENT) {
            for (Human student : students) {
                System.out.println("" + student.getName());
            }
        } else {
            for (Human teacher : teachers) {
                System.out.println("" + teacher.getName());
            }
        }
    }
       
    public String getSeatColor(int chair) {
        return seats[chair].getColor();
    }
    
    public void listSeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println("" + seats[i].getColor());
        }
    }
    
    public void countSeatsColor(String color) {
        int index = 0;
        int numSeats = 0;
        while (index < seats.length) {
            if (seats[index].getColor().equals(color)) {
                numSeats++;
            }
            index++;
        }
        displayNumColorSeats(color, numSeats);
    }
 
    private void displayNumColorSeats(String color, int numSeats) {
        System.out.println("The number of " + color + " seats is: " + numSeats + ".");
    }
}











