//sort elements in a list using streams
package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortad {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,34,56, 2, 1,56,3,65,2,45);
        List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Here is the Assending sorted List " +list1);
        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Here is the descending Order " +list2);
    }
}
