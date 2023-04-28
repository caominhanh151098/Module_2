package Week_3.dsa_list.linkedlist;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(new String("a"));
        ll.addFirst(13);
        ll.add(1, 4);
        ll.addFirst(3);
        ll.printList();
////        System.out.println(ll.remove(new String("a")));
////        System.out.println(ll.size());
////        System.out.println(ll.indexOf("a"));
        ll.clear();
        ll.add(1);
        ll.printList();
//
//
//        System.out.println(ll.get(1));
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//
//        LinkedList linkedList = new LinkedList();
//        linkedList.clear();


//        MyLinkedList clonelist = (MyLinkedList) ll.clone();
//        clonelist.printList();
    }
}