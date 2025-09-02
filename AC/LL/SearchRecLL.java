package AC.LL;

public class SearchRecLL {
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
        public int helper(Node head,int key)
        {
            if(head==null)
            {
                return -1;
            }
            if(head.data==key)
            {
                return 0;
            }
            int ind=helper(head.next,key);
            if(ind==-1)
            {
                return -1;
            }
            return ind+1;
        }
        public int recSearch(int key)
        {
            return helper(head,key);
        }
    
    public static void main(String[] args) {
        SearchRecLL ll=new SearchRecLL();
        ll.print();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
         System.out.println("Element found at:"+ll.recSearch(3));
        System.out.println("Element found at:"+ll.recSearch(5));
        
    }
}
