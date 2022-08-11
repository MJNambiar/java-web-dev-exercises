package Studio.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main (String[] args) {
        String statement = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        String statement = "If the product of two terms";
        char[] charactersInStatement = statement.toCharArray();
//        System.out.println(charactersInStatement);

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        Integer numberTimes = 0;
        for (char letter : charactersInStatement) {
            System.out.println("letter: " + letter + " Character Counts: " + characterCounts);
            if (characterCounts.containsKey(letter)) {
//                Integer increaseCount = characterCounts.get(letter);
//                increaseCount++;
//                characterCounts.put(letter, increaseCount);
                 characterCounts.put(letter, characterCounts.get(letter) + 1);

//                characterCounts.put(letter, numberTimes);
//                System.out.println("if clause: " + characterCounts);
            } else {
                numberTimes = 1;
                characterCounts.put(letter, numberTimes);
//                System.out.println("else if clause: " + characterCounts);
            }
        }

//        System.out.println(characterCounts);
        for (Map.Entry<Character, Integer> characterCount : characterCounts.entrySet()) {
            System.out.println(characterCount.getKey() + ": " + characterCount.getValue());
        }
    }
}

