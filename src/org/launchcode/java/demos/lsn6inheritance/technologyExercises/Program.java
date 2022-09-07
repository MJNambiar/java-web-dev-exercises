package org.launchcode.java.demos.lsn6inheritance.technologyExercises;

public class Program {
    public static void main(String args[]){
        SmartPhone iphone13 = new SmartPhone("Marina's phone", true, 300, 2000);

        Laptop dell = new Laptop("Work computer", false, 4000, "black");

        System.out.println(iphone13.findPercentPhotoStorage(300, 2000));
        System.out.println(iphone13.findRepairShop(true));

        System.out.println(dell.printColor("black"));
        System.out.println(dell.increaseStorage(4000));
        System.out.println(dell.getId());

        System.out.println(dell);
    }
}
