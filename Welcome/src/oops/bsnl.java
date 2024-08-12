package oops;

public class bsnl implements trai{
    @Override
    public String phonecall(int receivernumber) {
        if(receivernumber >0)
            return "Here we call connected with bsnl";
        else
            return "Call is not connected";
    }

    @Override
    public String sendsms(int receiversnumber) {
        if(receiversnumber >0)
            return "Here we Send sms to other person by using bsnl";
        else
            return "Sms is not sent";

    }

    @Override
    public String connection(int typeofg) {
        if(typeofg >0)
            return "Here bsnl is providing 4g";
        else
            return "Internet is not connected";
    }
}
