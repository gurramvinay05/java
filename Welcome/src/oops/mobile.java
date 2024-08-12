package oops;

public class mobile {
    public static void main(String[] args) {
        trai sim= new Airtel();
        System.out.println(sim.phonecall(5326));
        System.out.println(sim.sendsms(567845));
        System.out.println(sim.connection(5));
        sim.videocall();
    }


}