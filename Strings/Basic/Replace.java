package Strings.Basic;

public class Replace {
    public static void main(String args[])
    {
        String s="abcdefGHIJkpmmm";
        s.toCharArray();
        System.out.println(s.replace("m",""));
        System.out.println(s.replaceFirst("a","aa"));
        System.out.println(s.replaceAll("([A-Z])",""));

    }
}
