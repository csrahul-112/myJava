//this is circular queue code for normal queue by array is written in notebook;

public class QueueByArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)% size == front;
        }

        public void add(int data){
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            return;
        }

        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
            return result;
        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    // static class Queue{
    //     static int arr[];
    //     static int size;
    //     static int rear;
    //     static int front;
    //     Queue(int n){
    //         arr = new int[n];
    //         size = n;
    //         rear = -1;
    //         front = -1;
    //     }
    //     public static boolean isEmpty(){
    //         return rear == -1 && front == -1;
    //     }

    //     public static boolean isFull(){
    //         return (rear + 1) % size == front;
    //     }

    //     public static int remove(){
    //         if (isEmpty()) {
    //             System.out.println("Queue is Empty");
    //             return -1;
    //         }
    //         int result = arr[front];
    //         if (rear == front) {
    //             rear = front = -1;
    //             return result;
    //         }
    //         front = (front + 1) % size;
    //         return result;
    //     }
    //     public static void add(int data){
    //         if (isFull()) {
    //             System.out.println("Queue is full");
    //             return;
    //         }
    //         if (front == -1) {
    //             front = 0;
    //         }
    //         rear = (rear + 1) % size;
    //         arr[rear] = data;

    //     }

    //     public static int peek (){
    //         if (isEmpty()) {
    //             System.out.println("Queue is Empty");
    //             return -1;
    //         }

    //         return arr[front];
    //     }
    // }
    
    public static void main(String args[]){
        Queue q = new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
        q.remove();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        q.remove();
        q.remove();
        System.out.println(q.isEmpty());
    }
}