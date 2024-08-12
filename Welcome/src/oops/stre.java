package oops;

import java.util.Arrays;
import java.util.List;

public class stre {
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "Hello ", "V", "I", "N", "A", "Y");
        list.parallelStream().forEach(System.out::print);

    }
}
