package Week_3.dsa_list.linkedlist;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList list = new MyLinkedList(10);
        list.add(1);
        list.addFirst(11);
        list.addLast(12);
        list.addFirst(new String("a"));
        list.addFirst(13);
        list.add(1, 4);
        list.addFirst(3);
        Object[] arr = list.toArray();

        System.out.println(list);
//        list.remove(1);
//        list.remove("a");
//        list.clear();
//        System.out.println(list.get(4));
//        System.out.println(list.size());
//        list.printList();
//        MyLinkedList cloneList = (MyLinkedList) list.clone();
//        cloneList.add(1);
//        cloneList.printList();
//        System.out.println(list.contains(1));
        System.out.println(list.indexOf(3));
        System.out.println(list);

    }
}