//Write a program to Check whether the number is even or odd using switch statement
//package oops.conditional;
//
//import java.util.Scanner;
//
//public class evenorodd {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you value");
//        int i = sc.nextInt();
//        switch (i%2){
//            case 0:
//                System.out.println("This is the Even Number");
//                break;
//            case 1:
//                System.out.println("This is Odd Number");
//        }
//
//    }
//}


//3. Write a program to Check whether a character is a vowel or consonant using switch statement
package oops.conditional;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you value");
        String i = sc.nextLine();
        switch (i){
            case"a":
            case"e":
            case"i":
            case"o":
            case"u":
            case"A":
            case"E":
            case"I":
            case"O":
            case"U":
                System.out.println("This is the vowels");
                break;
            default:
                System.out.println("This is Consonent");
        }

    }
}