public class Two {
    public static void main(String[] args) {
        class Node {
            int value;
            Node next;
        }
        Node head = Node(5, null);
        Node tail = Node(10, null);
        head.next = tail;
        System.out.println(head.next.value);
    }
}
