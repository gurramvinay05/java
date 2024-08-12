import java.util.*;
public class mapvinay {
    public static void main(String[] args)
    {
//      Hashmap(it does not follow order)
        Map <Integer, String> map= new HashMap<Integer, String>();
        map.put(2, "Vinay");
        map.put(6, "Sunil");
        map.put(8, "Pawan");
        map.put(10, "Chandu");
        map.put(4, "Vamsi");
        map.put(5,"mahesh");
        map.put(3,"lokesh");
        System.out.println("Here are the First Hashmap results: "+ map);

        System.out.println("Here are the Hashmap results: "+ map.remove(2));
        map.replace(10,"Ramana");
        System.out.println("Here are the Hashmap after Replace results: "+ map);
        map.putIfAbsent(2, "vinay");
        System.out.println("Here are the Hashmap results: "+ map);
        Iterator i = map.keySet().iterator();
        while(i.hasNext())
            System.out.println("Here I am iterating the hashmap " + i.next());

//      Linked Hashmap(it follows the insertion order)
        Map <Integer, String> map1= new LinkedHashMap<>();
        map1.put(2, "Vinay");
        map1.put(8, "Pawan");
        map1.put(10, "Chandu");
        map1.put(4, "Vamsi");
        map1.put(6, "Sunil");
        System.out.println("Here are the First Linked Hashmap results: "+ map1);
        System.out.println("Here is the linked hashmap after performing Contain key " + map1.containsKey(4));
        System.out.println("Here is the linked hashmap after performing size " + map1.size());
        map1.clear();
        System.out.println("After clear the linked hashmap result" + map1);

//      Treemap(It follow sorted order)
        Map <Integer, String> map2= new TreeMap<>();
        map2.put(2, "Vinay");
        map2.put(8, "Pawan");
        map2.put(10, "Chandu");
        map2.put(4, "Vamsi");
        map2.put(6, "Sunil");
        System.out.println("Here are the First  Treemap results: "+ map2);
        System.out.println("Here are the Treemap Size:" +map2.size());
        System.out.println("Here are the Treemap Fetching the key value of 8 :" +map2.get(8));
    }
}