//From the given list of integers, print the numbers which are multiples of 5?
package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class multipleby5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,7,9,10,34,40,25,80,28,55,75,30);
        List<Integer> list1 = list.stream().sorted().filter(n ->n%5 ==0).collect(Collectors.toList());
        System.out.println("Here is the Original List " +list);
        System.out.println("Here is the List of Multiple By 5 " +list1);
    }
}
