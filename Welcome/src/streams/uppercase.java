//Convert array of Strings to upper case using streams
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("vInAy", "mUrAlI", "PuRaBi","PREeya");
        List<String> list1 = list.stream().map(list3-> list3.toUpperCase() ).collect(Collectors.toList());
//        <Class name>::<method name>
        System.out.println("Here Is the Orginal List " +list);
        System.out.println("Here Is the Uppercase List " +list1);
        List<String> list2 = list1.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Here is the Lower Case " +list2);
    }
}
