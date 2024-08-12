import java.util.Scanner;

public class Evenvinay {
    static int n,n2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n1 = sc.nextInt();

        while(n<=n1) {
            if(n%2==0)
                n2= n2+n;
            n += 2;
        }
        System.out.println("Sum Of Even NUmber 0  to " +n1 + "  is " + n2);

    }
}
