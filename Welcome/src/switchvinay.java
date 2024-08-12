////Write a program to Check whether a character is a vowel or consonant using switch statement
//import java.util.Scanner;
//public class switchvinay {
//    public static void main(String args[])
//    {
//        Scanner v=new Scanner(System.in);
//        System.out.println("Enter your value");
//        String vowel = v.nextLine();
//        switch (vowel){
//            case "A":
//                System.out.println("You entered value is vowel");
//                break;
//            case "E":
//                System.out.println("You entered value is vowel");
//                break;
//            case "I":
//                System.out.println("You entered value is vowel");
//                break;
//            case "O":
//                System.out.println("You entered value is vowel");
//                break;
//            case "U":
//                System.out.println("You entered value is vowel");
//                break;
//            case "a":
//                System.out.println("You entered value is vowel");
//                break;
//            case "e":
//                System.out.println("You entered value is vowel");
//                break;
//            case "i":
//                System.out.println("You entered value is vowel");
//                break;
//            case "o":
//                System.out.println("You entered value is vowel");
//                break;
//            case "u":
//                System.out.println("You entered value is vowel");
//                break;
//            default:
//                System.out.println("You entered consonent");
//        }
//
//    }
//}



// Write a program print total number of days in a month using switch case.
import java.util.Scanner;
public class switchvinay {
    public static void main(String args[])
    {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter your value");
        String Month = v.nextLine();
        switch (Month){
            case "January":
            case "August":
            case "July":
            case "May":
            case "March":
            case "October":
            case "December":
                System.out.println("You have 31 days in this Month");
                break;
            case "February":
                System.out.println("You have 29 days in this Month");
                break;
            case "April":
            case "September":
            case "November":
            case "June":
                System.out.println("You have 30 days in this Month");
                break;

            default:
                System.out.println("You entered Invalid Month, Please enter a valid Month!");
        }

    }
}

