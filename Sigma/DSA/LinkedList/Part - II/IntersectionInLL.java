public class IntersectionInLL {
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

    public Node getIntersection(Node head1, Node head2){
        while (head1 != null) {
            Node temp = head2;
            while (temp != null) {
                if (temp == head1) {
                    return head1;
                }
                temp = temp.next;
            }
            head1 = head1.next;
        }

        return null;
    }

    public static void main(String args[]){
        IntersectionInLL ll = new IntersectionInLL();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(8);
        head1.next = newNode;
        
        newNode = new Node(5);
        head1.next.next = newNode;

        newNode = new Node(2);
        head2.next = newNode;

        newNode = new Node(4);
        head2.next.next = newNode;
        head1.next.next.next = newNode;

        newNode = new Node(8);
        head2.next.next.next = newNode;

        newNode = new Node(1);
        head2.next.next.next.next = newNode;

        head2.next.next.next.next.next = null;

        Node intersectionPoint = ll.getIntersection(head1, head2);

        if (intersectionPoint == null) {
            System.out.println("No intersection point The LL are seprate");
        }else{
            System.out.println("The inter section point is " + intersectionPoint.data);
        }
        

    }

}
