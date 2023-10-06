import java.util.*;

//import java.util.LinkedList;
public class sample {
  static int size=0;

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

  public static void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static int removeFirst() {
    if (size == 0) {
      System.out.println("Sir the linkedlist is empty");
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public static void main(String args[]) {
    // LinkedList<String> ll = new LinkedList<>(); // This will cause an error
    LinkedList ll = new LinkedList(); // This is correct

    ll.addFirst(12);
    ll.addFirst(16);
    ll.addFirst(20);
    ll.print();
    System.out.println("Sir the Size of LinkedList is :" + ll.size);
    ll.removeFirst(); // This line will compile and run without errors
    ll.print();
    System.out.println("Sir the UPDATED Size of LinkedList is :" + ll.size);
  }
}
