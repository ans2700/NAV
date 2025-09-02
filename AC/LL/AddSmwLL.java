package AC.LL;

public class AddSmwLL {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void middle(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        if (index == 0) {
            addFirst(data);
            return;
        }
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        //node is in prev index

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        AddSmwLL ll = new AddSmwLL();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.middle(2, 5);
        ll.print();
    }
}
