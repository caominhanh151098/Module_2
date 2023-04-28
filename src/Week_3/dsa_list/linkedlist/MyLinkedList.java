package Week_3.dsa_list.linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new ArrayIndexOutOfBoundsException(String.format("Index %s Out of bound!", index));
        }
        Node temp = head;
        Node addNode = new Node(element);
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        addNode.next = temp.next;
        temp.next = addNode;
        numNodes++;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(e);
        }
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new ArrayIndexOutOfBoundsException(String.format("Index %s Out of bound!", index));
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        E nodeRemove = (E) temp.next.data;
        temp.next = temp.next.next;
        numNodes--;
        return nodeRemove;
    }

    public boolean remove(Object object) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(object)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        MyLinkedList cloneList = new MyLinkedList(head.data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            cloneList.addLast(temp.data);
        }
        return (E) cloneList;
    }

    public boolean contains(E o) {
        if (indexOf(o) != -1)
            return true;
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp.next != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public E get(int index) {
        Node temp = head;
        if (index > numNodes || index < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Index %s Out of Bounds", index));
        }
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        return (E) temp.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public void printList() {
        System.out.println(this);
    }

    public Object[] toArray() {
        Object[] newArray = new Object[size()];
        int i = 0;
        for (Node x = head; x != null; x = x.next)
            newArray[i++] = x.data;
        return newArray;
    }

    public String toString() {
        Object[] array = this.toArray();
        String result = "";
        try {
            result = "[" + array[0];
            for (int i = 1; i < array.length; i++) {
                result += "," + array[i];
            }
            result += "]";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[]");
        }
        return result;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

}
