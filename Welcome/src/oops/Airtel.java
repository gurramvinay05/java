package oops;

public class Airtel implements trai{

    @Override
    public String phonecall(int receivernumber) {
        if(receivernumber >0)
            return "Here we call connected with Airtel";
        else
            return "Call is not connected";
    }

    @Override
    public String sendsms(int receiversnumber) {
        if(receiversnumber >0)
            return "Here we Send message via Airtel";
        else
            return "message is not sent";
    }

    @Override
    public String connection(int typeofg) {
        if(typeofg >0)
            return "Here we  connected Airtel 5G";
        else
            return "Data is not connected";
    }

    @Override
    public void videocall(){
        System.out.println("Here we are using Videocall");
    }


}
