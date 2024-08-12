import com.sun.glass.ui.Size;

import java.util.*;

public class setvinay {
    public static void main(String[] args)
    {
//      It does not follow order, Remove the Duplicates
        Set<String> set= new HashSet<String>();
        set.add("vinay");
        set.add("vasu");
        set.add("mural");
        set.add("phantasma");
        System.out.println("Here are the  set results "+ set);

        set.remove("phantasma");
        System.out.println("Here are the  set After remove "+ set);
        int length=set.size();
        System.out.println("Here are the  set Size "+ length);

        Iterator i= set.iterator();
        while(i.hasNext())
            System.out.println("Here are the set Iterator " +i.next());

        set.clear();
        System.out.println("Here are the  set Clear "+ set);


//      It follow the order.
        Set<String> linkedset= new LinkedHashSet<>();
        linkedset.add("vinay");
        linkedset.add("vasu");
        linkedset.add("vasu");
        linkedset.add("mural");
        linkedset.add("phantasma");
        System.out.println("Here are the  linkedset results "+ linkedset);

        System.out.println(linkedset.remove("phantasma") );



//      It is Sorted the list.
        Set<String> Treeset= new TreeSet<>();
        Treeset.add("vinay");
        Treeset.add("vasu");
        Treeset.add("vasu");
        Treeset.add("mural");
        Treeset.add("phantasma");
        System.out.println("Here are the  Treeset results "+ Treeset);
        System.out.println("Here is the least value String " + Treeset.stream().count());
        System.out.println("Here are the  Treeset results "+ Treeset.size());
        System.out.println("Here are the  Treeset results "+ Treeset.remove("mural"));


    }
}