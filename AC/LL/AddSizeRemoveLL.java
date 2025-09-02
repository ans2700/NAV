package AC.LL;

public class AddSizeRemoveLL {

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
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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
            System.out.println("Empty LL");
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
        size++;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("List empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;

    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Empty LL");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }

    public static void main(String[] args) {
        AddSizeRemoveLL ll = new AddSizeRemoveLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.middle(1, 5);
        ll.print();
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println(size);
        ll.removeFirst();
        ll.print();
        System.out.println(size);
        ll.removeLast();
        ll.print();
        System.out.println(size);

    }
}
