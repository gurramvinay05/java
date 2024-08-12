package oops;
public class Inher1vinay extends Inhervinay{
    public static void main(String[] args) {
        Inhervinay IV = new Inher1vinay();
//        IV.pencil();
        IV.pen();

    }
    void pencil() {
        System.out.println("We have a Pencil");
    }

    @Override
    void pen() {
        System.out.println("Here we are override pen with inkpen");
    }
}
