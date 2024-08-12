package oops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class strea {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(3,4,5,2,1,56,7);
        System.out.println("Printing the list" +list);
        List <Integer> ls = list.stream()
                .sorted()
                .filter(i -> i%2==1)
                .map(n -> n*2)
                .collect(Collectors.toList());
        System.out.println("Here is the final output " +ls);
        System.out.println("Here is the final output " +ls);
    }
}
