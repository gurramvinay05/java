////Remove duplicate numbers from arrayList without using sets
//package Collections;
//import java.util.ArrayList;
//import java.util.List;
//
//public class arraylist {
//    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list1.add(34);
//        list1.add(22);
//        list1.add(43);
//        list1.add(18);
//        list1.add(62);
//        list1.add(72);
//        list1.add(22);
//        list1.add(43);
//        list1.add(22);
//        list1.add(18);
//        list1.add(34);
//        list1.add(62);
//        list1.add(5);
//        list1.add(5);
//        list1.add(5);
//        list1.add(5);
//        list1.add(5);
//        System.out.println("Here are the Arraylist " +list1);
//        for (int i=0; i< list1.size(); i++)
//        {
//            if(!list2.contains(list1.get(i))){
//                list2.add(list1.get(i));
//            }
//        }
//        System.out.println("Here are the Arraylist " +list2);
//    }
//}

//Taking arrayList as an input, display a map which shows the
//elements of the list as key and the count of elements as value in a maps.


package Collections;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        List <Integer> list =new LinkedList<>();
        list.add(34);
        list.add(22);
        list.add(43);
        list.add(18);
        list.add(62);
        list.add(72);
        list.add(22);
        list.add(43);
        list.add(22);
        list.add(18);
        list.add(34);
        list.add(62);
        list.add(62);
        list.add(62);
        list.add(62);

        System.out.println("here are the list " + list);
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        System.out.println("Here are the Map Result " + countMap);
    }
}


//Write a Java program to search for an element in an array list using for loop
//package Collections;
//import java.util.ArrayList;
//import java.util.List;
//public class arraylist {
//    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(34);
//        list1.add(22);
//        list1.add(43);
//        list1.add(18);
//        list1.add(62);
//        list1.add(72);
//        list1.add(43);
//        list1.add(18);
//        list1.add(62);
//        System.out.println("Here are the Arraylist " + list1);
//
//        int element = 20;
//        boolean elementfound = false;
//
//        for (int i = 0; i < list1.size(); i++) {
//            if (list1.get(i) == element) {
//                System.out.println("Element found ");
//                elementfound =true;
//                break;
//            }
//        }
//        if(!elementfound){
//            System.out.println("Element not found");
//        }
//    }
//}
//

//Divide array list into two lists based on a index given.
//
//package Collections;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class arraylist {
//
//    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(34);
//        list1.add(22);
//        list1.add(43);
//        list1.add(18);
//        list1.add(62);
//        list1.add(72);
//        list1.add(43);
//        list1.add(18);
//        list1.add(62);
//        System.out.println("Here are the Arraylist " +list1);
//
//        int index=5;
//
//        List<Integer> list2 = new ArrayList<>();
//        List<Integer> list3 = new ArrayList<>();
//
//        for(int i=0;i<list1.size();i++){
//            if(i <= index){
//                list2.add(list1.get(i));
//            }
//            else
//                list3.add(list1.get(i));
//        }
//        System.out.println("Here is the first part " +list2);
//        System.out.println("Here is the Second part " +list3);
//
//
//    }
//}
