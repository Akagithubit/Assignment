import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ShuffleArray {
    public static void main(String[] args) {
        // Shuffle an Array
        List<Integer> shuffledArray = shuffleArray(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Shuffled Array: " + shuffledArray);

        // Convert Roman Numerals to Integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral (e.g., IX): ");
        String romanNumeral = scanner.nextLine();
        int intValue = convertRomanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + intValue);

        // Check if Input is a Pangram
        System.out.print("Task C: Enter a sentence: ");
        String sentence = scanner.nextLine();
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is Pangram: " + isPangram);
        scanner.close();
    }

    // Shuffle an Array
    public static List<Integer> shuffleArray(Integer... values) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, values);
        Collections.shuffle(list);
        return list;
    }

    //  Convert Roman Numerals to Integer
    public static int convertRomanToInteger(String romanNumeral) {
        // Define a mapping of Roman numerals to integers
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int result = 0;
        int index = 0;

        while (index < romanNumeral.length()) {
            for (int i = 0; i < symbols.length; i++) {
                if (romanNumeral.startsWith(symbols[i], index)) {
                    result += values[i];
                    index += symbols[i].length();
                    break;
                }
            }
        }

        return result;
    }

    // Check if Input is a Pangram
    public static boolean checkPangram(String sentence) {
        sentence = sentence.toLowerCase();
        Set<Character> alphabetSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }
}
