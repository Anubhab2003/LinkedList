import java.util.LinkedList;
public class ll{
    public static void main(String args[]){
        LinkedList <Integer> LL=new LinkedList<>();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.addFirst(4);
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
    }
}