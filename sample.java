import java.util.*;
//import java.util.LinkedList;
public class sample {

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
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public  void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String args[]) {
    // LinkedList<String> ll = new LinkedList<>(); // This will cause an error
    LinkedList ll = new LinkedList(); // This is correct

    ll.addFirst(12);
    ll.addFirst(16);
    ll.addFirst(20);
    ll.print();
  }
}
