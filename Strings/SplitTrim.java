package Strings;

public class SplitTrim {
    public static void main(String args[])
    {
        String s="   a,  b  ,c   ";
        String[] s1=s.split(",");
        for(String i: s1){
        System.out.println(i.trim());
    }

    }
}
