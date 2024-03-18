public class CheckPalindrome {

    public static class Node{
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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

     

    public boolean checkPalindrome(){
        if (head == null || head.next == null) {
            return true;
        }

        //find mid
        Node midNode = findMid(head);
        //reverse from mid
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;
        //check if 1st half == 2nd half
        Node toCheckR = rightHead;
        Node toCheckL = leftHead;
        while (toCheckR != null) {
            if(toCheckL.data != toCheckR.data){
                return false;
            }
            toCheckL = toCheckL.next;
            toCheckR = toCheckR.next;
        }

        return true;
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

        public static void main(String args[]){
            CheckPalindrome ll = new CheckPalindrome();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(2);
            ll.addLast(1);

            ll.printLL();

            System.out.println(ll.checkPalindrome());
        }
    



}
