package Collections;
import java.util.*;
public class LinkedL {
    public static void main(String args[])
    {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        
        

        ll.remove(0);
        System.out.println(ll);

        ll.clear();
        System.out.println(ll);
        
        //another way of adding and printing the elements in linkedlist
        LinkedList <Integer> Ll=new LinkedList<>();
        for(int i=0;i<5;i++)
        ll.add(i);
        System.out.println(ll);

        for(int i=0;i<ll.size();i++)
        {
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("null");

        //operations- add first,last,middle
        LinkedList <Integer> ops=new LinkedList<>();
        ops.addFirst(10);
        ops.addLast(20);
        int middle=ops.size()/2;
        ops.add(middle,15);
        System.out.println(ops);
        for(int i=0;i<ops.size();i++)
        System.out.println(ops.get(i)+" ");

        ops.removeFirst();
        System.out.println(ops);

        ops.removeLast();
        System.out.println(ops);

        ops.remove(0);
        System.out.println(ops);
    }
}
