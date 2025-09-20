package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String str = " hello is world ";
        String reversed = reverseWords(str);
        System.out.println(reversed); // Output: world hello
    }

    public static String reverseWords(String str) {
        String result = "";
        int end = str.length();

        // Traverse the string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            // Find the start of a word
            if (str.charAt(i) == ' ' || i == 0) {
                int start = (i == 0) ? 0 : i + 1;
                result += str.substring(start, end) + " ";
                end = i; // Update end to the next word boundary
            }
        }

        return result.trim(); // Remove trailing space
    }
}


