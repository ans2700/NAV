package Strings;
public class CoundW {
    // Function to count the number of words in a string
    public static int countWords(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int wordCount = 0;
        int state = 0; // Initial state is OUT

        // Traverse all characters of the input string
        for (int i = 0; i < str.length(); i++) {
            // Check for backslash first
            System.out.println("ch:"+ str.charAt(i));
            if (str.charAt(i) == '\\') {
                i++; // Skip next character (after backslash)
                System.out.println("Inside ch:"+ str.charAt(i));
                continue;
            }

            // If the current character is a word character
            if (Character.isLetterOrDigit(str.charAt(i))) {
                // If previous state was OUT, increment word count and change state to IN
                if (state == 0) {
                    wordCount++;
                    state = 1;
                }
            }
            // If the current character is not a word character
            else {
                // Change state to OUT
                state = 0;
            }
        }

        return wordCount;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "abc \\n\" ann "; // Input string
        System.out.println("No of words: " + countWords(str) + "of string " + str); // Count words
    }
}
// This code is contributed by kislay__kumar