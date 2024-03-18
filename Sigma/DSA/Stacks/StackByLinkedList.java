public class StackByLinkedList {

        static class Node {
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        static class Stack{
            static Node head = null;

            //to check if stack is empty
            public static boolean isEmpty(){
                return head == null;
            }

            //function to push values in my stack
            public static void push(int data){
                Node newNode = new Node(data);
                if (isEmpty()) {
                    head =  newNode;
                    return;
                }
                
                newNode.next = head;
                head = newNode;
            }

            //function to pop element from statck
            public static int pop(){
                if (isEmpty()) {
                    return -1;
                }

                int top = head.data;
                head = head.next;
                return top;
            }

            //function to peek on the stack
            public static int peek(){
                if (isEmpty()) {
                    return -1;
                }
                return head.data;
            }
        }       

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
