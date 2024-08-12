package arrays;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] a ={2,5,78,2,89,3,9,43,66,33};
        System.out.println("Here is the original Array " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Here is the Sorted Array " + Arrays.toString(a));

    }
}
