package Strings;

public class StringDetails {

    public static void ans(String s) {
        int vowels = 0, consonants = 0, digits = 0;
        int upper = 0, lower = 0, special = 0;

        String vowel = "", consonant = "", digit = "";
        String uppers = "", lowers = "", specials = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowels++;
                    vowel += c;
                } else {
                    consonants++;
                    consonant += c;
                }

                if (Character.isUpperCase(c)) {
                    upper++;
                    uppers += c;
                } else {
                    lower++;
                    lowers += c;
                }

            } 
            else if (Character.isDigit(c)) {
                digits++;
                digit += c;
            } else {
                special++;
                specials += c;
            }
        }

        System.out.println("Vowels:" + vowels + ":" + vowel);
        System.out.println("Consonants:" + consonants + ":" + consonant);
        System.out.println("Digits:" + digits + ":" + digit);
        System.out.println("Uppercase:" + upper + ":" + uppers);
        System.out.println("Lowercase:" + lower + ":" + lowers);
        System.out.println("Special Characters:" + special + ":" + specials);
    }

    public static void main(String[] args) {
        String str = "Hello World123!";
        ans(str);
    }
}
