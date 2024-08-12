package oops;

import java.util.function.Function;

public class Functiona {
    public static void main(String[] args) {
//      Apply
//        Function < Integer, Double> half= v -> v/2.0;
//        System.out.println(half.apply(10));

//      and Then
//        Function < Integer, Double> half= v -> v/2.0;
//        half= half.andThen(v -> 3*v);
//        System.out.println(half.apply(10));

//      compose
        Function < Integer, Double> half= v -> v/2.0;
        half= half.compose(v -> 3*v);
        System.out.println(half.apply(10));
//
//      Identify
//        Function< Integer, Integer> v = Function.identity();
//        System.out.println(v.apply(10));
    }
}
