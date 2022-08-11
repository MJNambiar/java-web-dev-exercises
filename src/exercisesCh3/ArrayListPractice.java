package exercisesCh3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int findSum(ArrayList<Integer> listOfNumbers) {
        int total = 0;
        for (int integer : listOfNumbers) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static String printWord(ArrayList<String> wordList) {
        for (String i : wordList) {
            if (i.length() == 5) {
                System.out.println("WordList " + i);
            }
        }
        return "";
    }

    public static String printWordUserNumber(ArrayList<String> wordList) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a number for word length to search: ");
        int searchNumber = input.nextInt();
        for (String i : wordList) {
            if (i.length() == searchNumber) {
                System.out.println("WordList " + i);
            }
        }
        return "";
    }

    //main should be at top above other methods
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        listOfNumbers.add(11);
        listOfNumbers.add(12);
        listOfNumbers.add(13);
        listOfNumbers.add(14);
        listOfNumbers.add(15);
        listOfNumbers.add(16);
        listOfNumbers.add(17);
        listOfNumbers.add(18);
        listOfNumbers.add(19);

        int answer = findSum(listOfNumbers);
        System.out.println(answer);
        System.out.println("Sum " + ArrayListPractice.findSum(listOfNumbers));


        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Jeffrey");
        wordList.add("Sarah");
        wordList.add("Ali");
        System.out.println(ArrayListPractice.printWord((wordList)));
        System.out.println(ArrayListPractice.printWordUserNumber(wordList));
    }


}
