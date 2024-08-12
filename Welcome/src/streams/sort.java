//How do you sort the given list of decimals in reverse order?
package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sort {
    public static void main(String[] args) {
        List<Double> sort1 = Arrays.asList(23.08, 56.56, 34.34, 76.67,43.09);
        List<String> lines = Arrays.asList("java", "c", "python");
        List<String> result = lines.stream().filter(n -> !n.equalsIgnoreCase("c")).collect(Collectors.toList());
        System.out.println("Result of the String: "+ result);
        List<Double> sort2 = sort1.stream().sorted().collect(Collectors.toList());
        System.out.println("Here is the Sorted List " +sort2);
        List<Double> sort3 = sort1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(" Here is the reverse Sorted Order " +sort3);
    }
}