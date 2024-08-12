package string;

public class Stringvinay {
    public static void main(String[] args) {
//      String Literal Normal Declaration
        String s= "Hi Vinay How are you?";
        String s2= "Hi Vinay How are you?";
        System.out.println("Here we are checking the Equals Class " + s.equals(s2));
        String v= "    Hello Vinay";
        System.out.println("Here is the output of S : " + s);
//       By Using New Keyword
        String s1 = new String("Hi Vinay How are you?");
        System.out.println("Here is the output of S1 : " + s1);
//      String Compares by using .equals() Method.
        System.out.println("Here is the String compares by using .equals() output " + s.equals(s1));
//      String Compares by using == Method.
        System.out.println("Here is the String compares by using output " + s==s1);
//      String Concatenation
        String out = s.concat(v);
        System.out.println("Here is the Concatenation Output " +out);
//      Substring
        System.out.println("Here are the Substring Results :" + s.substring(4));
        System.out.println("Here are the Substring Results :" + s.substring(4,12));

//      String Class Methods.
//      Uppercase and lowercase
        System.out.println("Here is the Upper case letters " + s.toUpperCase());
        System.out.println("Here is the Lower case letters " + s.toLowerCase());
//      Trim to clear the Spaces
        System.out.println("Printing the v value " + v);
        System.out.println("Here is the Trim " + v.trim());
//      Starts with and End with
        System.out.println("Here we have to check weather it start with the given String " + s.startsWith("Hi"));
        System.out.println("Here we have to check weather it start with the given String " + s.startsWith("Vinay"));
        System.out.println("Here we have to check weather it End with the given String " + s.endsWith("?"));
        System.out.println("Here we have to check weather it End with the given String " + s.endsWith("Hi"));
//      Checking character by using the index
        System.out.println("Here we checking character by using the index " +s.charAt(5));
//      Checking the length
        System.out.println("Here we are checking the length of the string " + s.length());
//      We are replacing the String
        System.out.println("Here we are replacing the String " +s.replace("hi", "Hey"));//It is a case Sensetive.
        System.out.println("Here we are replacing the String " +s.replace("Hi", "Hey"));



    }
}
