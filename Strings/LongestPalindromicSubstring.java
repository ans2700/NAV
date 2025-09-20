package Strings;

public class LongestPalindromicSubstring {

    public static boolean P(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String subs(String str) {
        int n = str.length();
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n- i; j++) {
                String sub = str.substring(j, j + i);
                System.out.println(sub+" "+i+" "+j);
                if (P(sub)) 
                {
                    return sub;
                }
            }
        }
        return "invalid";
    }

    public static void main(String[] args) {
        String str = "xyzyy ";
        System.out.println(subs(str));
    }

}
