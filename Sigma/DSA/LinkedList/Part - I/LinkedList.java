public class LinkedList {
    //Class Node to Create node as object of this class for our LL
    public static class Node {
        int data;
        Node next;
        // Constrtuctor for Our Node
        public Node (int data){
            this.data = data;
            this.next = null;
        }

    }
    // Defining Head Tail and Size of our LL
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods
    //add

    //Function to add at Begining of a LL
    public void addFirst(int data){//O(1)
        //s-1 create a new node
        Node newNode = new Node(data);
        size++;


        //inCase ll is empty and adding the first node it will we head as well as tail
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //s-2 assign head to next of newNode so it can refer the formar head
        newNode.next = head; //this will act as a link

        //s-3 now make the newNode our new Head
        head = newNode;

        return;
    }

    // Function to add a Element at the Last of LL
    public void addLast(int data){//(1)
        //s-1 create a new node
        Node newNode = new Node(data);
        size++;

        //inCase ll is empty and adding the first node it will we head as well as tail
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //s-2 connection the new node at last by adding refer of new node to next of formal tail
        tail.next = newNode;

        //s-3 making our newNode the new tail
        tail = newNode;

        return;
    }
    // Function to print Our LL
    public void printLL() {//O(n)
        if (head == null) {
            System.out.println("LL is EMPTY ");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        return;
    }

    // Function to add a node at a given index in our LL
    public void add(int idx, int data){//O(n)
        if (idx == 0) {
            addFirst(data);
            return;
        }else if (idx == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        //i = idx - 1 : temp = prev of given idx
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Function to remove 1st element from our ll
    public int removeFirst(){//O(1)
        if (size == 0) {
            System.out.println("LL is EMPTY");
            return Integer.MIN_VALUE;
        }else if(size == 1){
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

    //Function to remove last element from our LL
    public int removeLast(){//O(n)
        if (size == 0) {
            System.out.println("LL is EMPTY");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }

        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    //To search in Iterative manner in our LL
    public int iterativeSearch(int key){//O(n)
        if (size == 0) {
            System.out.println("LL is EMPTY");
            return Integer.MAX_VALUE;
        }
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }

        return -1;
    }

    //Helping function to search in a Recursive manner in our LL
    public int helpForRecSearch(int key, Node head){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helpForRecSearch(key, head.next);
        if (idx == -1) {
            return -1;
        }else{
            return ++idx;
        }
    }

    //Function to search in a recursive manner in  our LL
    public int recursiveSearch(int key){
        return helpForRecSearch(key, head);
    }

    //Function to reverse the Linked List
    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //Function to removeNthFromLast of LL
    public void removeNthFromLast(int n){
        //Calculating Size of LL
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
        return;
    }



    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        //we will not write code for operations on ll in main func we will create method for same in the LinkedList class
        //method to add -----//type 1 addFirst

        System.out.println();
        ll.printLL();
        System.out.println();
        System.out.println(ll.iterativeSearch(4));

        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
        ll.addLast(5);
        ll.printLL();
        ll.add(2, 3);
        ll.printLL();

        System.out.println(size);

        ll.removeLast();
        ll.printLL();

        ll.addLast(5);
        ll.removeFirst();
        ll.printLL();

        ll.add(0, 1);
        ll.printLL();

        System.out.println();

        System.out.println(ll.iterativeSearch(4));
        System.out.println(ll.iterativeSearch(12));
        System.out.println(ll.recursiveSearch(4));
        System.out.println(ll.recursiveSearch(12));

        ll.reverseLL();
        ll.printLL();

        ll.removeNthFromLast(3);
        ll.printLL();
        ll.add(4, 3);
        ll.printLL();
        System.out.println(tail.data);System.out.println(size);
    }
}
