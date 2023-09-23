# LinkedList

import java.util.*;

This line imports the java.util package, which contains many useful classes, including the LinkedList class that we will be using in this program.

public class LinkedList{

This line declares a public class called LinkedList. This class will contain methods for creating and manipulating linked lists.

public static class Node{

This line declares a public static class called Node. This class will represent the nodes in our linked list. Each node will have two fields: data and next. The data field will store the value of the node, and the next field will store a reference to the next node in the list.

public int data;

This line declares a public integer field called data. This field will store the value of the node.

public Node next;

This line declares a public Node field called next. This field will store a reference to the next node in the list.

public Node(int data){

This is the constructor for the Node class. It takes an integer parameter and sets the data and next fields of the node accordingly.

this.data=data;

This line sets the data field of the node to the value of the parameter passed to the constructor.

this.next=null;

This line sets the next field of the node to null. This indicates that the node is the last node in the list.

public static Node head;

This line declares a public static Node field called head. This field will store a reference to the first node in the linked list.

public static Node tail;

This line declares a public static Node field called tail. This field will store a reference to the last node in the linked list.

public void addFirst(int data){

This method adds a new node to the beginning of the linked list. It takes an integer parameter as the value of the new node.

Node newNode= new Node(data);

This line creates a new Node object with the value of the parameter passed to the method.

if(head==null){

This line checks if the linked list is empty. If it is, then the new node will be the first and last node in the list.

head=tail=newNode;

This line sets the head and tail fields of the linked list to the new node.

return;

This line returns from the method.

}

newNode.next=head;

This line sets the next field of the new node to the current head of the linked list.

head=newNode;

This line sets the head of the linked list to the new node.

}

public void addLast(int data){

This method adds a new node to the end of the linked list. It takes an integer parameter as the value of the new node.

Node newNode=new Node(data);

This line creates a new Node object with the value of the parameter passed to the method.

if(head==null){

This line checks if the linked list is empty. If it is, then the new node will be the first and last node in the list.

head=tail=newNode;

This line sets the head and tail fields of the linked list to the new node.

return;

This line returns from the method.

}

tail.next=newNode;

This line sets the next field of the tail node to the new node.

tail=newNode;

This line sets the tail of the linked list to the new node.

}

public static void print(){

This method prints the contents of the linked list to the console.

Node temp=head;

This line creates a temporary Node object and sets it to the head of the linked list.

while(temp!=null){

This line loops while the temporary Node object is not null.

System.out.print(temp.data+"->");

This line prints the value of the temporary Node object to the console, followed by an arrow (->).

temp=temp.next;

This line sets the temporary Node object to the next node in the linked list.

}

System.out.println("null");

This line prints the word null to the console, which indicates the end of
