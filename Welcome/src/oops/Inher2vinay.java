package oops;
public class Inher2vinay extends Inher1vinay{
    public static void main(String[] args) {
        Inher2vinay IV = new Inher2vinay();
        IV.pencil();
        IV.pen();
        IV.kit();
    }
    void kit(){
        System.out.println("We have a Kit Contains pen and Paper");
    }
}