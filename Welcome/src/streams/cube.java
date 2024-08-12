//Write a program to perform cube on list of elements and filter numbers greater than 50
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class cube {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,34,56, 2, 1,56,3,65,2,45);
        List<Integer> list3 = list.stream().sorted().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println("Here IS the Even Numbers "+list3);

        List<Integer> list2 = (List<Integer>) list.stream().sorted().map(n ->(n*n*n)).filter(n -> n>=50).collect(Collectors.toList());
        System.out.println("Here Is the List Of the Given Number " +list);
        System.out.println("Here Is the Cube Of the Given Number " +list2);

    }
}
