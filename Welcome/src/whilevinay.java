////Write a program which does the following
////
////Declare a variable a and initialize it to 0
////Use the syntax above to create a loop, output the following to the console
////Print a in separate lines as long as it is less than 7.
////Increment a by 1 in each iteration.
//
//
//public class whilevinay {
//
//    public static void main (String[] args)
//    {
//        int a = 7;
//        while(a<7) {
//            System.out.println("Hi " + a);
////            int b=1;
//////            nested While
////            while(b<4){
////                System.out.println("How are you "+ b);
////                b++;
////            }
//            a++;
//        }
//
//
//    }
//}

//Write a program to print all even numbers between 1 to 100. – using while loop
public class whilevinay {

    public static void main (String[] args)
    {
        int a =2;
        while(a<=100) {
            if(a%2==0)
                System.out.println("Even NUmber " + a);
            a += 2;
        }
    }
}
