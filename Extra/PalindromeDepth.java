/*
* This program calculates the energy released when mass is converted to energy.
*
* @author  Samuel Webster
* @version 1.0
* @since   2024-03-25
*/

/**
 * This program calculates palindrome depth
 */
public class PalindromeDepth {
    private PalindromeDepth() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    
    /**
     * This function calculates palindrome depth
     */
    public static int palindromeDepth(long integer, int currentDepth = 0) {
        String integerStr = String.valueOf(integer);
        String reversedIntegerStr = new StringBuilder(integerStr).reverse().toString();
        long reversedInteger = Long.parseLong(reversedIntegerStr);
        if (integer == reversedInteger) {
            return currentDepth;
        } else {
            long sum = integer + reversedInteger;
            return palindromeDepth(sum, currentDepth + 1);
        }
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 99;

        for (int i = start; i <= end; i++) {
            int intDepth = palindromeDepth(i);
            System.out.println(i + " has depth " + intDepth);
        }

        System.out.println("\nDone.");
    }
}
