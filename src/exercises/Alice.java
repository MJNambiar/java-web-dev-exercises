package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a search term here: ");
        String searchTerm = input.nextLine();
        if (sentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            int length = searchTerm.length();
            int index = sentence.indexOf(searchTerm);
            System.out.println("Search term was found. Search term length: " + length + ". Search term index: " + index);

            String editedSentence = sentence.replace(searchTerm.toLowerCase(), "");
            System.out.println(editedSentence);

        } else {
            System.out.println("Search term not found.");
        }
    }
}
