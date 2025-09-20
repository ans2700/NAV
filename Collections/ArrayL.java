package Collections;

import java.util.*;

public class ArrayL {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        //indexing starts from 0
        al.add("1");
        al.add("Hello");
        al.add("123");
        al.add("abc");
        System.out.println(al);

        al.remove(1);
        System.out.println(al);

        al.remove("Hello");
        System.out.println(al);

        if(al.contains("123"))
        {
            System.out.println("Element found at:"+al.indexOf("123"));
        }

        if(al.isEmpty())
        {
            System.out.println("ArrayList is empty");
        }
        ArrayList <Integer> il=new ArrayList<>();
        //using another al since the above al was declared to be string type
        for(int i=0;i<5;i++)
            il.add(i);
        System.out.println(il);
        for(int i=0;i<il.size();i++)
            il.get(i);
    }

}
