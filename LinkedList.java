public class LinkedList {
    //Creating a node
    public static class Node {
        int data;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

   public void addFirst(int data)
   {
       /* to add first:
       creat new node
       new node next = head
       head = new node */
       
       //Step 1 = creat new node
        Node newNode = new Node(data);
        size++;

       if(head == null)
       {
         head = tail= newNode;
         return;

       } 
       //Step 2 = newNode head =  next
       newNode.next = head; //link

       //step 3-  head = newNODE
       head  =  newNode;
    }

       public void addLast(int data)
       {
        //creat a new node
        //tail.next= new node
        // tail= new node
         
        //Step1 = Creat new node
        Node newNode = new Node(data);
        size++;
        
        if(head== null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

       }

       public void print(){

         if(head== null)
        {
            System.out.println("LinkidIn is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
           
        }
    }

    public void addMiddle(int index, int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;

        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1)
        {
            temp  = temp.next;
            i++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst()
    {
        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1)
        {
            int val = head.data;
            head = tail = null;size=0;
            return val;
        }
        int val  = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i=size -2
        Node prev =  head;

        for(int i=0;i<size-2;i++){
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;


    }

    public int itrsearch(int key){//O(n) 
        Node temp = head;
        int i =0;
        while(temp != null){
            if(temp.data == key){//key found
            return i;
        }
        temp = temp.next;
        i++;

        }

        return -1;
    }

    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        } 

        return idx+1;
    }


    public int recSearch(int keys){
        return  helper(head, keys);

    }
//while(curr!=null){
    //Reversing a linkedList.
    //next = curr.next
    //curr.next = prev
    //prev = curr
    //curr = next}

    public void reverse()
    {//O(1)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;


        }


// FIND AND REMOVE THE Nth node from thr End  ===   size-n+1
    public void deleteNthfromEnd(int n){

        //calculate size
        int sz = 0;
        Node temp= head;
        while(temp!=null)
        {
            temp = temp.next;
            sz++;


        }

        if(n == sz){
            head = head.next;// remove first
            return;

        }
        //sz-n;

        int i=1;
        int iToFind =sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;


        }

        prev.next = prev.next.next;
        return;




    }


    //CHECK IF LL IS PALINDROM OR NOT
    // FIND THE MIDDLE NODE
    private Node findMidNode(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next == null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null||head.next==null)
        return true;
        
        //find Middle
        Node mid = findMidNode(head);

        //reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;//right half head
        Node left = head;
        //check if left equal right

        while(right!=null)
        {
            if(left.data != right.data)
            return false;

            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static boolean isCycle(){
    Node slow = head;
    Node fast = head;

    while(fast !=null&&fast.next != null){
        slow = slow.next;//+1
        fast = fast.next.next;//+2
        if(slow==fast){

            return true;// cycle exist
        }
    }
    return false;// cycle doesnt exist
    }

    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast.next!=null && fast!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                cycle = true;
                break;
            }
        } 
        if(cycle == false){
            return;
        }


        // find meeting point

        slow = head;
        Node prev = null;
        while(slow!=fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        
        //remove cycle -> last.next = null

        prev.next = null;
    }
/* Mathmatical prove of removing a cycle:
        slow distance  =  x + a*d + y
        fast distance =   x + b*d + y

        x+b*d+y=2*(x+a*d+y)
        bd-2ad = x+y
        x = d(b-2a)-y
        x = kd-y
        x= (k-1)d+(d-y) */



       /*  private Node getMiddle(Node head){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!= null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;

        }

        private Node merge (Node head1, Node head2){
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;

            while(head1 !=null && head2!=null)
            {
                if(head1.data <=head2.data){
                temp.next =head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1!=null) {
            temp.next = head1;
             head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp = head2;
            head2 = head2.next;
            temp = temp.next;

        }

        return mergedLL.next;

            }

        

        public Node mergeSort(Node head)
        {
            if(head ==null || head.next == null)
            return head;
            //find mid

            Node mid = getMiddle(head);
            //left and right MS

            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);
            
            //merge
            return merge(newLeft,newRight);
        } */

        
    

    public static void main(String[] args)
    {

        LinkedList ll = new LinkedList();// creating an object of linkedlist class
        //ll.print();
        ll.addFirst(2);//ll.print();
        ll.addFirst(1);//ll.print();
        ll.addFirst(3);//ll.print();
        ll.addLast(4);//ll.print();
        ll.addLast(5);
        ll.print();
       /*  
        ll.head = new Node(1);//adding data in the head
        ll.head.next = new Node(2);// now linking the tail of the head to the next node*/
       /*  ll.addMiddle(3,14);
        System.out.println(size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.itrsearch(4));
        System.out.println(ll.itrsearch(12));

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));

        ll.deleteNthfromEnd(3);
 */
        System.out.println(" ");
        ll.reverse();
        ll.print();
        System.out.println(" ");

        System.out.println("is LL palindrome??>>>>>>>>>"+ll.checkPalindrome());
        System.out.println("LL has cycle??>>>>>>>>"+isCycle());
        
        ll.removeCycle();
        System.out.println("LL has cycle??>>>>>>>>"+isCycle());

        ll.head = ll.mergeSort(ll.head);
        ll.print();




    }
    
}
