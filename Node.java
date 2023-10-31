import java.util.LinkedList;
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class zigzag {
    public static Node head;

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        head = ll.head;

        zz();

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void zz() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
}
