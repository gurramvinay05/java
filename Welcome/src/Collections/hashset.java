////Given a Hashset - check if a particular element is present in it.
package Collections;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        System.out.println("Here are the set results " + set);
        System.out.println("Here are the set results " + set.contains(6));

    }
}


//Given 2 hashsets - parent and child, remove elements of child from parent.

//package Collections;
//import java.util.HashSet;
//public class hashset {
//    public static void main(String[] args) {
//        HashSet <Integer> set = new HashSet<>();
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.add(6);
//        set.add(7);
//        set.add(8);
//        set.add(9);
//        System.out.println("Here are the set results " + set);
//
//        HashSet <Integer> set1 = new HashSet<>();
//        set1.add(2);
//        set1.add(12);
//        set1.add(4);
//        set1.add(15);
//        set1.add(6);
//        set1.add(18);
//        set1.add(8);
//        set1.add(23);
//        System.out.println("Here are the set results " + set1);
//
//        HashSet<Integer> remove = new HashSet<Integer>(set1);
//        remove.removeAll(set);
//        System.out.println("Here are the parent and child, remove elements of child from parent" + remove);
//
//    }
//}