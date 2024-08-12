package Exception;

public class tryvinay {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c= a/b;
            System.out.println("Here we are Output " +c);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Here we are getting Error");

        }
        finally {
            System.out.println("Here are the finally block");
        }

    }
}
