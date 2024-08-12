//How do you merge two unsorted arrays into single sorted array using Java 8 streams?
package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sortedarray{
    public static void main(String[] args) {
        int [] a= new int[] {2,4,6,8};
        int [] b= new int[] {1,3,4,5,7,9};
        int [] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println("Here Is the Sorted Array " + Arrays.toString(c));

    }
}