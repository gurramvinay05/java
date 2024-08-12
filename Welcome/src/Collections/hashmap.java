//.Retrive all key value pairs from a hashmap.
package Collections;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(0,"Venkata");
        map.put(1,"Vinay");
        map.put(2,"Gurram");
        map.put(3,"Sunil");
        map.put(4,"Achutha");
        map.put(5,"Harsha");
        System.out.println("Here we are printing Hashmap key, values " + map);
        System.out.println("Here we are printing Hashmap keys " + map.keySet());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String Value = entry.getValue() + "_abc";
            entry.setValue(Value);
        }
        System.out.println("Here we are printing Hashmap key, values " + map);
    }
}
