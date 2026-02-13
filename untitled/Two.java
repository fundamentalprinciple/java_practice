public class Two {
    public static void main(String[] args) {

        class Node {
            int value;
            Node next;

            Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }

        Node head = new Node(5, null);
        Node tail = new Node(10, null);
        
        head.next = tail;
        
        System.out.println(head.next.value);
    }
}
