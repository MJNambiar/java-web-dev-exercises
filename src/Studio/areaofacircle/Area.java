package Studio.areaofacircle;

import java.util.Scanner;
import Studio.areaofacircle.Circle;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        while (radius <= 0) {
            System.out.println("Please enter a positive integer.");
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
        }
        //need to cast variable from double to a string
//        try {
//
//        } catch (java.util.InputMismatchException) {
//            System.out.println("Please enter a positive integer.");
//            System.out.println("Enter a radius: ");
//            radius = input.nextDouble();
//        }
        if (radius > 0) {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
    }
}