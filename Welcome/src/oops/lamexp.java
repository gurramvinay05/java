package oops;

interface vinay{
    void show();
}

public class lamexp {
    public static void main(String[] args) {

        vinay v = () -> System.out.println("Here is the output");
        v.show();

    }
}
