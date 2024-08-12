//2. Write a program to find maximum between three numbers
package oops.conditional;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter your Second Number");
        int n2 = sc.nextInt();
        System.out.println("Enter your Third Number");
        int n3 = sc.nextInt();
        if (n1>n2){
            System.out.println("N1 is the greatest Value");
        } else if (n2>n3) {
            System.out.println("N2 is the greatest Value");
        }
        else  System.out.println("N3 is the greatest Value");
    }
}
