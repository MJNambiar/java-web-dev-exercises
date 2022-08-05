package exercises;
import java.util.Scanner;

public class CarQuestions {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of miles driven: ");
        int milesDriven = input.nextInt();

        System.out.println("Gas consumed: ");
        int gasConsumed = input.nextInt();

        int milesPerGal = milesDriven / gasConsumed;
        System.out.println("Miles per gallon = " + milesPerGal);
    }
}
