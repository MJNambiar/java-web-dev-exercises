package org.launchcode.java.demos.lsn6inheritance.technologyExercises;

public class Laptop extends Computer {

    private String color;

    public Laptop(String name, boolean isAppleProduct, double memoryInGB, String color) {
        super(name, isAppleProduct, memoryInGB);
        this.color = color;
    }

    public String printColor (String color){
        return "The laptop color is " + color + ".";
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Laptop ID: " + getId() + "\n" + "Laptop name: " + getName();
    }
}
