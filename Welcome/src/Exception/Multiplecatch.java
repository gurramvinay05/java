package Exception;

import java.util.Scanner;

public class Multiplecatch {

    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your first number: ");
            int a =sc.nextInt();
            System.out.println("Please enter your Second number: ");
            int b =sc.nextInt();
            int c= a/b;
            System.out.println("Total value " +c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }

        finally {
            System.out.println("Here we are Executing Finally Block");
        }
    }


}