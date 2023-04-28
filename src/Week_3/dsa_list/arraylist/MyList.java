package Week_3.dsa_list.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length)
            ensureCapacity();
        int i;
        for (i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[i] = element;
    }

    public boolean add(E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
        return true;
    }

    public E remove(int index) {
        Object result = elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return (E) result;
    }

    public boolean contains(E o) {
        if (indexOf(o) != -1)
            return true;
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o)
                return i;
        }
        return -1;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > DEFAULT_CAPACITY)
            elements = Arrays.copyOf(elements, minCapacity);
    }
    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }
}
