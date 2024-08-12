//Write a program to print tables
package looping;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Starting Number");
        int s = sc.nextInt();
        System.out.println("Enter Ending Number");
        int e = sc.nextInt();
        System.out.println("Enter Table Number");
        int t = sc.nextInt();
        while (s<=e) {
            System.out.println(s + " * " + t + " = " + (s * t));
            s++;
        }
    }
}
