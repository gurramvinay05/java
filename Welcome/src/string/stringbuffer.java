package string;

public class stringbuffer{
    public static void main(String[] args) {
        StringBuffer v = new StringBuffer("Vinay");
        StringBuffer s = new StringBuffer("Vinay");
        System.out.println("Here we are checking the Equals Class " + s.equals(v));
        System.out.println("Here is the string Buffer output " + v);
//      Append
        System.out.println("Here is the string Buffer append " + v.append("Gurram"));
//      Insert
        System.out.println("Here is the string Buffer Insert " + v.insert(4,"hello"));
//      replace
        System.out.println("We are replacing the String " +v.replace(3,15,"vinay"));
//      delete
        System.out.println("Here we are delete the string " +v.delete(2,4));
//      reverse
        System.out.println("We are reversing the String " +v.reverse());
//      Capcity
        System.out.println("We are cheking the capacity " +v.capacity());
        v.append("Here we are creating the cheking the capacity");
        System.out.println("We are cheking the capacity " +v.capacity());
        v.append("Here we are creating the cheking the capacity Here we are ");
        System.out.println("We are cheking the capacity " +v.capacity());
//      What is the Chracter by using index
        System.out.println("Here is the String " +v);
        System.out.println("Here we are checking the char is which pisition " +v.charAt(3));
        System.out.println("Here we are checking the char is which pisition " +v.charAt(5));
//      Checking the length
        System.out.println("Checking the length of the String " + v.length());
//      Sub String
        System.out.println("Here we are creating the Substring " + v.substring(2));
        System.out.println("Here we are creating the Substring " + v.substring(2,7));







    }
}
