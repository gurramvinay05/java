//Write a program to check whether a year is leap year or not
package oops.conditional;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You looking Year");
        int n= sc.nextInt();
        if (n%4==0){
            System.out.println("This is the leap year");
        }
        else System.out.println("This is not a leap Year");
    }
}
