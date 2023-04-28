package Week_3.dsa_list.arraylist;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<>();

        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(5);
        listInt.add(7);
        listInt.add(11);

        System.out.println(listInt);
        System.out.println(listInt.get(3));

//        listInt.add(3,10);
//        System.out.println(listInt);
//        listInt.remove(3);
//        System.out.println(listInt);
//        System.out.println(listInt.indexOf(7));
//        System.out.println(listInt.contains(7));
//
//        System.out.println(listInt.add(7));
//        listInt.ensureCapacity(4);
//listInt.clear();

    }
}
