package AC.LL;

public class SizeLL {
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
        public static int size=0;
        public void addFirst(int data)
        {
            Node newNode=new Node(data);
            size++;
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addLast(int data)
        {
            Node newNode=new Node(data);
            size++;
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print()
        {
            Node temp=head;
            if(head==null)
            {
                System.out.println("Empty LL");
            }
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        // public void size()
        // {
        //     Node temp=head;
        //     int i=1;
        //     while(temp.next!=null)
        //     {
        //         temp=temp.next;
        //         i++;
        //     }
        //     System.out.println("Size of the LinkedList is:"+i);
        // }
    public static void main(String[] args) {
        SizeLL ll=new SizeLL();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        System.out.println("Size of the LL is:"+size);

    }
}

