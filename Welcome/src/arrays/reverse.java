//Write a program to reverse the array
package arrays;

import java.util.Arrays;

public class reverse {
    public static void reverseArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,1,3,5,7,9};
        System.out.println("Original Array " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed Array " + Arrays.toString(array));
        System.out.println("Count Array " +(array.length));
        System.out.println("Sum Array " +(Arrays.stream(array).sum()));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
