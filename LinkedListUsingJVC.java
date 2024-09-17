import java.util.LinkedList;
public class LinkedListUsingJVC {

    public static void main(String[] args)
    {
        //creat
        LinkedList <Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //print

        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
