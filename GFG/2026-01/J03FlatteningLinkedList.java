
public class J03FlatteningLinkedList {

    static class Node {

        int data;
        Node bottom;
        Node next;

        public Node(int data) {
            this.data = data;
            this.bottom = null;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            Node child = current.bottom;
            while (child != null) {
                System.out.print(child.data + " -> ");
                child = child.bottom;
            }
            current = current.next;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next = new Node(10);

        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);

        head.next.next.next = new Node(28);

        printList(head);
    }
}
