package AC.LL;

public class SearchItLL {
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
                return;
            }
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public int search(int key)
        {
            Node temp=head;
            int i=0;
            while(temp!=null)
            {
                if(temp.data==key)
                {
                    return i;
                }
                temp=temp.next;
                i++;
                
            }return -1;
        }
    
    public static void main(String[] args) {
        SearchItLL ll=new SearchItLL();
        ll.print();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        System.out.println("Element found at:"+ll.search(4));
        
    }
}
