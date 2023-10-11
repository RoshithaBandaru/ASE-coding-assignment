//3. Check if the input is panagram or not. (Panagram is a sentence that contains all the
alphabets from a-z)

import java.util.HashSet;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        String input = System.console().readLine("Enter a string: ");

        Set<Character> uniqueCharacters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (Character.isLetter(character)) {
                uniqueCharacters.add(Character.toLowerCase(character));
            }
        }

        boolean isPangram = uniqueCharacters.size() == 26;

        // Print 
        if (isPangram) {
            System.out.println("The input string is a pangram!");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}
