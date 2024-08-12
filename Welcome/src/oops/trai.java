package oops;

public interface trai {

    String phonecall(int receivernumber);


    String sendsms(int receiversnumber);

    String connection(int typeofg);

    default void videocall(){
        System.out.println("new feature is added but not implemented it is onprocess");
    }

    static void arvideocall(){
        System.out.println("New Ar Video call feature is added Still implementing");

    }




}
