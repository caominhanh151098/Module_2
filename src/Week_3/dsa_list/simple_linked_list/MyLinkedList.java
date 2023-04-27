package Week_3.dsa_list.simple_linked_list;

public class MyLinkedList {
    private int numNodes = 0;
    private Node head;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node dataAdd = new Node(data);
        for (int i = 0; i < index - 1 && i < numNodes; i++) {
            temp = temp.next;
        }
        Node cache = temp.next;
        temp.next = dataAdd;
        dataAdd.next = cache;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index && i < numNodes; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
