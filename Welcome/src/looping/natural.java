//Write a program to print all natural numbers from 1 to n
package looping;

import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the ending number ");
        int f = sc.nextInt();
        int i=1;
        while (i<f){
            System.out.println(i);
            i++;
        }
    }
}
