import java.util.LinkedList;

public class ll{
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergell=new Node(-1);
        node temp=mergell;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head1=head2.next;
            temp=temp.next;
        }
        return mergell.next;
    }
    public Node mergeSort(Node head){
        //Find mid
        Node mid=getMid();
        //left and right part Merge sort
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);
        //Merge
        return merge(newleft,newright);
    }
    public static void main(String args[]){
        LinkedList <Integer> LL=new LinkedList<>();
        LL.add(5);
        LL.add(4);
        LL.add(3);
        LL.addFirst(6);
        
        System.out.println(LL);
        mergeSort(LL.addFirst(6));
        System.out.println(LL);
    }
}