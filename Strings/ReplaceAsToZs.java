package Strings;

public class ReplaceAsToZs {

    public static String raz(String s) {
        String rep = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                rep += 'z';
            } else {
                rep += s.charAt(i);
            }
        }
        return rep;
    }

    public static void main(String args[]) {
        String s = "abc";
        System.out.println(raz(s));
    }
}
