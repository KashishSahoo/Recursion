import java.util.ArrayList;
import java.util.List;

public class a18_ph {
    
    public static void main(String[] args) {
        int n = 23;
        System.out.println(letterCombinations(Integer.toString(n)));
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        // List to store the results
        List<String> result = new ArrayList<>();

        // Mapping of digits to corresponding letters
        String[] mapping = {
                "", // 0 -> no letters
                "", // 1 -> no letters
                "abc", // 2 -> abc
                "def", // 3 -> def
                "ghi", // 4 -> ghi
                "jkl", // 5 -> jkl
                "mno", // 6 -> mno
                "pqrs", // 7 -> pqrs
                "tuv", // 8 -> tuv
                "wxyz" // 9 -> wxyz
        };

        // Start the recursive process
        phone("", digits, mapping, result);

        return result;
    }

    private static void phone(String current, String remainingDigits, String[] mapping, List<String> result) {
        // If no more digits are left, add the current combination to the result list
        if (remainingDigits.isEmpty()) {
            result.add(current);
            return;
        }

        // Get the first digit from the remaining digits
        int digit = remainingDigits.charAt(0) - '0';

        // Get the letters corresponding to the digit
        String letters = mapping[digit];

        // Loop through each letter and recurse
        for (char ch : letters.toCharArray()) {
            phone(current + ch, remainingDigits.substring(1), mapping, result);
        }
    }
    
}
