package oops;

public class jio implements trai{

    @Override
    public String phonecall(int receivernumber) {
        if(receivernumber >0)
            return "Here we call connected with jio";
        else
            return "Call is not connected";
    }

    @Override
    public String sendsms(int receiversnumber) {
        if(receiversnumber >0)
            return "Here we Send sms to other person by using jio";
        else
            return "Sms is not sent";
    }

    @Override
    public String connection(int typeofg) {
        if(typeofg >0)
            return "Here jio is providing 5g";
        else
            return "Internet is not connected";
    }
}
