package Week_4.dsa_stack.queue_array;

import java.util.Arrays;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (this.capacity == currentSize)
            return true;
        return false;
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0)
            return true;
        return false;
    }

    public void enqueue(int item) {
        if (isQueueFull())
            System.out.println("Out of memory!");
        else {
            queueArr[tail] = item;
            if (tail == capacity - 1) {
                tail = 0;
            }
            else tail++;
            currentSize++;
        }
    }

    public void dequeue() {
        if (isQueueEmpty())
            System.out.println("Memory is Empty, can't get value!");
        else {
            if (head == capacity - 1)
                head = 0;
            else head++;
            currentSize--;
        }
    }

    public void display() {
        int i = head;
        int size = currentSize;
        while (size > 0) {
            System.out.println(queueArr[i]);
            if (i == capacity - 1)
                i = 0;
            else i++;
            size--;
        }
    }

}
