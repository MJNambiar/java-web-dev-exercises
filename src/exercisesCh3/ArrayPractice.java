package exercisesCh3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] someInts = {1,1,2,3,5,8};

        for (int i: someInts) {
            System.out.println(i);
        }

        for (int i: someInts) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        String statement = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = statement.split(" ");
//        System.out.println(Arrays.toString(words));
        String[] words = statement.split("\\.");
        System.out.println(Arrays.toString(words));
    }
}
