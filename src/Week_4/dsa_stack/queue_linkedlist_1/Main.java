package Week_4.dsa_stack.queue_linkedlist_1;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(14);
        queue.enQueue(22);
        queue.enQueue(-6);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(9);
        queue.enQueue(20);

        queue.display();


    }
}
