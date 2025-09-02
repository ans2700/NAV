package AC.LL;

public class BasicLinkedList {
    public static class Node
    {
        int data;
        Node next;
    
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;
//Methods
//add
//remove
//search
//print
public static void main(String[] args) {
    BasicLinkedList ll=new BasicLinkedList();
    ll.head= new Node(1);
    ll.head.next=new Node(2);
    //Method for add
    //Method for remove
    //Method for print
}
}
