//Ask user to enter age and print weather you are eligible or not!
import java.util.Scanner;
public class Conditional {
    public static void main(String args[])
    {
        int age;
        Scanner vote=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        age=vote.nextInt();
        if(age>=18)
            System.out.println("You are eligible to caste your vote");

        else
            System.out.println("You are not eligible to caste your vote");
    }

}
