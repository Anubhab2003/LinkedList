import java.util.*;

public class LinkedList {
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
    public static int size;

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
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
        public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeLast(){
        if(size==0){
            System.out.print("LinkedList is empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;

        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static int itersearch(int key){
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;

        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }
    //REVERSE OF LIST
    public static void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthfromend(int n){
        //Calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;

        }
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //Slow-Fast Approach
    public Node findmid(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node slow=head;
        Node fast=head;
        while(fast!=null||fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }
    public boolean checkpalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        Node midnode=findmid(head);
        //Step 2 reverse of 2nd half of ll
        Node prev=null;
        Node curr=midnode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //Step 3 checking palindrome
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static  boolean cycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle
        prev.next = fast.next;

    }
    

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.print();
        // System.out.println(ll.checkpalindrome());
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(cycle());
        removeCycle();
        System.out.println(cycle());


        


    }
}