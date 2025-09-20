package Strings;

public class CountStringInSentence {

    public static void main(String[] args) {
        String mainString = "this is a test string, test this string again";
        String subString = "test";
        int count = 0;
        int lastIndex = 0;

        // Loop until indexOf returns -1, indicating the substring is no longer found
        while ((lastIndex = mainString.indexOf(subString, lastIndex)) != -1) {
            count++; // Increment count for each found occurrence
            lastIndex += subString.length(); // Move the search starting point past the found substring
        }

        System.out.println("The substring \"" + subString + "\" occurs " + count + " times.");
    }

}
