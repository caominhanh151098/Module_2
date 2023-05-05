package Week_4.dsa_stack.queue_array;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);

        myQueue.enqueue(1);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(0);
        myQueue.enqueue(6);
        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.display();
    }
}
