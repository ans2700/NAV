package Strings;

public class TwoStringRotations {
    public static void main(String args[]) {
        String str1 = "abcde";
        String str2 = "cedab";

        if (str1.length() != str2.length()) {
            System.out.println("str2 is NOT a rotation of str1");
        } else {
            String concat = str1 + str1;
            
            if (concat.contains(str2)) {
                System.out.println("str2 IS a rotation of str1");
            } else {
                System.out.println("str2 is NOT a rotation of str1");
            }
        }
    }
}
