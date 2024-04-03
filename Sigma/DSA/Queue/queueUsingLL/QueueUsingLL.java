public class QueueUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = head.data;
            if (head == tail) {
                head = tail = null;
            }else{
                head = head.next;
            }
            return result;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }
    
    }
    public static void main (String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.remove();

        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        while (q.head != null) {
            System.out.println(q.head.data);
            q.head = q.head.next;
        }
    }
}
