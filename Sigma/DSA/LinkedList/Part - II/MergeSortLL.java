public class MergeSortLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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

    private Node getMidNode(Node head){

        Node slow = head;
        Node fast = head.next; //because we want our mid to be last node of left half not first node of right half can be done that way too though

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        mergedLL = mergedLL.next;
        return mergedLL; // could simply write return merged.next;
    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node midNode = getMidNode(head);
        Node rhead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rhead);

        return merge(newLeft, newRight);
    }

    public void zigZag(){
        Node fast = head.next;
        Node slow = head;

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

        Node RH = prev;
        Node LH = head;

        Node nextR, nextL;

        while (RH != null && LH != null) {
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;
            LH = nextL;
            RH = nextR;
        }
    }

    public static void main(String args[]){
        MergeSortLL ll = new MergeSortLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLL();
        ll.zigZag();
        ll.printLL();

    }
}
