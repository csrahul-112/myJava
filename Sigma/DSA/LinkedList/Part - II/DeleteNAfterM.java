public class DeleteNAfterM {
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

    // Function to print Our LL
    public static void printLL() {//O(n)
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

    public static void deleteNAfterM(int m, int n){
        Node temp1 = head;
        Node temp2 = head;
        int i = 1;
        for(int j = 1; j < m; j++){
            temp1 = temp1.next;
        }
        while (i < (m+n)) {
            temp2 = temp2.next;
            i++;
        }
        temp1.next = temp2.next;
    }

    public static void main(String args[]){
        //DeleteNAfterM ll = new DeleteNAfterM();
        head = new Node(1);
        
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        deleteNAfterM(2, 2);

        printLL();
    }
}
