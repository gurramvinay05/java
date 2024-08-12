//public class forvinay
//{
//    public static void main(String[] args) {
//        for (int a = 1; a < 7; a++)
//        {
//            System.out.println("Hi hello " + a);
//        }
//    }
//}

//Write a program to print multiplication table of any number - using for loop

public class forvinay
{
    public static void main(String[] args) {
        int x=6;
        for (int a = 1; a <= 10;a++)
        {
            System.out.println(x + "*" + a +"=" + x*a);
        }
    }
}

//


//How do you find the sum of the digits in a for loop?
//import java.util.Scanner;
//public class forvinay
//{
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter Your Number");
//        int a = Sc.nextInt();
//        int num = a,sum ;
//
//        for (sum = 0; a > 0; a = a / 10) {
//                sum += num % 10;
//                num =num/10;
//        }
//        System.out.println("Total value " + sum);
//
//    }
//}