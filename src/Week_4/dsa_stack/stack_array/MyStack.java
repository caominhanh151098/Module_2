package Week_4.dsa_stack.stack_array;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Out of memory!");
        } else {
            arr[index++] = element;
        }
    }

    public int pop() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println("Memory is empty!");
        } else {
            temp = arr[--index];
        }
        return temp;
    }
    public int size() {
        return index;
    }
    public boolean isEmpty() {
        if (index == 0)
            return true;

        return false;
    }

    public boolean isFull() {
        if (index == size)
            return true;
        return false;
    }
}
