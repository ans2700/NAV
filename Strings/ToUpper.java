package Strings;

public class ToUpper {
    public static void main(String[] args) {
        String s="Abc";
        String s1="";
        char[] c=s.toCharArray();
        for(char i:c)
        {
            s1+=Character.toUpperCase(i);
        }
        System.out.println(s1);
    }
}
