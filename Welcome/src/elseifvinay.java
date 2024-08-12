////A school has following rules for grading system:
////a. Below 25 - F
////b. 25 to Below 45 - E
////c. 45 to Below 50 - D
////d. 50 to Below 60 - C
////e. 60 to Below 80 - B
////f. 80 - A
////
import java.util.Scanner;
public class elseifvinay {
    public static void main(String args[])
    {
        int marks;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        marks= s.nextInt();

        if((marks<=0) || (marks>100)) {
            System.out.println("Please Enter a Valid number");
        } else if(marks<25)
            System.out.println("You are Failed this Exam");
        else if(marks<45)
            System.out.println("You Got E Grade this Exam");
        else if(marks<50)
            System.out.println("You Got D Grade this Exam");
        else if(marks<60)
            System.out.println("You Got C Grade this Exam");
        else if(marks<80)
            System.out.println("You Got B Grade this Exam");
        else
            System.out.println("You Got a Grade this Exam");
    }
}


//2. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
//For first 50 units Rs. 0.50/unit
//For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill

//
//import java.util.Scanner;
//public class elseifvinay {
//    public static void main(String args[])
//    {
//        int unit;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Please enter your units: ");
//        unit= s.nextInt();
//        double amt, surcharge, Total;
//        if(unit<=50)
//        {
//            amt= unit*0.50;
//            System.out.println("You Bill Is  " + amt);
//
//        }
//        else if(unit<=150)
//        {
//            amt= ((unit-50)*0.75)+ (25.0);
//            System.out.println("You Bill Is  " + amt);
//        }
//        else if(unit<250)
//        {
//            amt= ((unit-150)*1.20) + (100.0);
//            System.out.println("You Bill Is  " + amt);
//        }
//
//        else{
//            amt=((unit-250)*1.50) +(220);
//        }
//        surcharge=amt *0.2;
//        System.out.println("You surcharge Is  " + surcharge);
//
//        Total = surcharge+amt;
//
//        System.out.println("You Total Bill Is  " + Total);
//
//    }
//}

//Write a program to check whether a number is divisible by 5 and 11 or not.

//import java.util.Scanner;
//public class elseifvinay {
//    public static void main(String args[])
//    {
//        int Num;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Please enter your number: ");
//        int num= s.nextInt();
//
//        if((num%5==0)&&(num%11==0))
//        {
//            System.out.println("This number is divisible by 5 and 11");
//        }
//        else
//            System.out.println("This number is not divisible by 5 and 11");
//    }
//}



