
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
        System.out.println("null");
    }

    public static void printFlatenedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.bottom;
        }
        System.out.println("null");
    }

    public static Node mergeNode(Node a, Node b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        Node result;

        if (a.data < b.data) {
            result = a;
            result.bottom = mergeNode(a.bottom, b);
        } else {
            result = b;
            result.bottom = mergeNode(a, b.bottom);
        }
        return result;
    }

    public static Node Flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }

        root.next = Flatten(root.next);

        root = mergeNode(root, root.next);
        return root;
    }

    public static void main(String args[]) {
        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next = new Node(10);
        head.next.bottom = new Node(20);

        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);

        head.next.next.next = new Node(28);

        printList(head);

        Node root = Flatten(head);
        printFlatenedList(root);
    }
}
