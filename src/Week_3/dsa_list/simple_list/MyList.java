package Week_3.dsa_list.simple_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void ensureCapa() {
        elements = Arrays.copyOf(elements,elements.length * 2);
    }

    public E get(int i) {
        if (i >= size || i < 0)
            throw new ArrayIndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        return (E) elements[i];
    }
}
