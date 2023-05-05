package Week_4.dsa_stack.queue_linkedlist_1;

public class Queue {
    private Node front;
    private Node rear;
    public int size = 0;

    public void enQueue(int data) {
        Node node = new Node(data);
        if (rear == null) {
            front = rear = node;
            size++;
            return;
        }
        rear.link = node;
        rear = node;
        rear.link = front;
        size++;
    }

    public Node deQueue() {
        if (front == null) {
            return null;
        }
        Node temp = front;
        if (front == rear) {
            front = rear = null;
        } else front = temp.link;
        size--;
        return temp;
    }

    public void display() {
        Node node = front;
        for (int i = 0; i < size; i++) {
            System.out.print(node.data + " ");
            node = node.link;
        }
    }
}

class Node {
    public int data;
    public Node link;

    public Node(int data) {
        this.data = data;
    }
}
