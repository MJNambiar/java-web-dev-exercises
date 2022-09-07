package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String args[]) {
        HouseCat garfield = new HouseCat("Garfield", 13);
        garfield.eat();
        System.out.println(garfield.isTired());
        System.out.println(garfield.getWeight());
    }
}
