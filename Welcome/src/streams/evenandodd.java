//Given a list of integers, separate odd and even numbers?
package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class evenandodd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34, 34, 56, 77, 89, 34, 33, 24);
        List <Integer> list1 = list.stream().filter(n ->n%2 ==1).collect(Collectors.toList());
        System.out.println("here is the Original  Values "  +list);
        System.out.println("here is the Odd Values "  +list1);
        List<Integer> list2 = list.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println("Here is the Even number " +list2);
    }
}
