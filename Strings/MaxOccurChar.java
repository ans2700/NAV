package Strings;

public class MaxOccurChar {

    public static void main(String[] args) {
        String s = "cdcda";
        int n = s.length();
        int longest = 0;
        char c = ' ';
        if (n == 0) {
            System.out.println("no string");
            return;
        }
        System.err.println(c);
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int count = 1;
            System.out.println(ch);
            for (int j = i + 1; j < n; j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }

            }
            if (count > longest) {
                longest = count;
                c = ch;
            }
        }
        System.out.println("Max occurring char: " + c);
        System.out.println("Count: " + longest);

    }
}
