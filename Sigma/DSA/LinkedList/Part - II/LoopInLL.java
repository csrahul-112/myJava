public class LoopInLL {
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

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        return;
    }

    public static void printLL(){
        if (size == 0) {
            System.out.println("LL is EMPTY");
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static boolean detectLoopInLL(){//if we remove static we can still use this function by calling it through object like ll is obj of LoopInLL class
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){

        //detect cycle/loop
        Node slow = head;
        Node fast = head;
        boolean exist = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                exist = true;
                break;
            }
        }

        if (exist == false) {
            System.out.println("there is no loop in LL");
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        //point last node to null
        prev.next = null;
    }
    public static void main(String args[]){
        //LoopInLL ll = new LoopInLL();
        head = new Node(1);
        size++;
        Node temp = new Node(2);
        head.next = temp;
        size++;
        head.next.next = new Node(3);
        size++;
        head.next.next.next = temp;
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // tail.next = head;
        System.out.println(detectLoopInLL());
        //ll.printLL();
        removeCycle();
        System.out.println(detectLoopInLL());
        printLL();
        removeCycle();
        

    }
}
