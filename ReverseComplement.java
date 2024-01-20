import java.util.HashMap;
import java.util.Map;

public class ReverseComplement {
    public static String reverseComplement(String dnaString) {
        Map<Character, Character> complementMap = new HashMap<>();
        complementMap.put('A', 'T');
        complementMap.put('T', 'A');
        complementMap.put('C', 'G');
        complementMap.put('G', 'C');

        // Reverse the DNA string
        StringBuilder reversedString = new StringBuilder(dnaString).reverse();

        // Replace each symbol with its complement
        StringBuilder complementedString = new StringBuilder();
        for (char symbol : reversedString.toString().toCharArray()) {
            complementedString.append(complementMap.get(symbol));
        }

        return complementedString.toString();
    }

    public static void main(String[] args) {
        String dnaString = "GTCAG";
        String reverseComplemented = reverseComplement(dnaString);
        System.out.println(reverseComplemented);
    }
}
