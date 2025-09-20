package Strings;

public class Length {

    public static void main(String[] args) {
        String s = "abcse";
        char[] c = s.toCharArray();
        int count = 0;
        for (char i : c) {
            System.out.print(i);
            count++;
        }
        System.out.print("\n");
        System.out.println("Length of string:" + count);
    }
}
