public class SwapingNodes {
    public static class Node {
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

    public static void swapNodes(int x, int y){
        if (x == y) {
           return; 
        }

        Node currX = head, prevX = null;

        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;

        while (currY != null & currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        }else{
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        }else{
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;


    }

    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        size = 4;

        printLL();
        swapNodes(4, 2);
        printLL();

    }
}
