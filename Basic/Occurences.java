package Basic;

import java.util.*;

public class Occurences {

    public static void count(String s) {
        //clean by removing any punctuation(if)
        String str = s.replaceAll("[^a-zA-Z ]", "");
        System.out.println(str);
        String[] words = str.split(" ");
        Map<String, Integer> c = new HashMap<>();
        for (String i : words) {
            Integer getc = c.get(i);
            if (getc == null) {
                c.put(i, 1);
            } else {
                c.put(i, getc + 1);
            }
        }
        System.out.println(c);

    }


    public static void main(String[] args) {
        String s = "a a abc abc a abc a a abc abc.";
        count(s);
    }
    // public static void main(String args[])
    // {
    //    String s="abvhchhabh";
    //    String s1="ab";
    //    int lastIndex=0;
    //    int currIndex=0;
    //    while(lastIndex!=-1)
    //    {
    //        lastIndex=s.indexOf(s1,lastIndex);
    //        if(lastIndex!=-1)
    //        {
    //            System.out.println("found at:"+lastIndex);
    //            lastIndex+=s1.length();
    //        }
           
    //    }
    //}
       
       
    }

