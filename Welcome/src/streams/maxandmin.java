//Given a list of integers, find maximum and minimum of those numbers?
package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxandmin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,7,30,44,65,23,45,79,45,264,35,100);
        int l= list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Here is the minimum number "+ l);
        int list1 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Here Is the Maximum Number " + list1);
    }
}
