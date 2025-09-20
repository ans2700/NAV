package Strings.Basic;
import java.util.*;
public class CAlphaOccur {
    public static void main(String[] args) {
        // String s="abcbbac";
        // char c='b';
        // int count=0;
        // for(int i=0;i<s.length()-1;i++)
        // {
        //     if(s.charAt(i)==c)
        //     {
        //         count++;
        //     }
        // }
        // System.out.println("Count of "+c+" in the string "+s+" is "+count);
        HashMap <Character,Integer> hm=new HashMap<>();
        String s="abcbbac";
        char c='b';
        for(char i:s.toCharArray())
        {
            hm.put(i,hm.getOrDefault(i,0)+1);   
        }
        System.out.println("Count of "+c+" is "+hm.get(c));

    }
}
