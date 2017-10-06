import java.util.ArrayList;
import java.util.List;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("anagram"));
    }

    public static List uniqueCharacters(String input){
        List<Character> unique = new ArrayList<>();

        if (input.length() > 0) {
            for (int i = 0; i < input.length(); i++) {
                int frequency = input.length() - (input.replaceAll(String.valueOf(input.charAt(i)), "")).length();
                if (frequency == 1) {
                    unique.add(input.charAt(i));
                }
            }
            return unique;
        }

        unique.add('0');
        return unique;
    }
}

// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases
// Should print out:
// ["n", "g", "r", "m"]

