package oops;

import java.util.function.Predicate;

public class predica {
    public static void main(String[] args) {
        Predicate <Integer> lesser = i -> (i>18);
        System.out.println(lesser.test(10));
    }
}
