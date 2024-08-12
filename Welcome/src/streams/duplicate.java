//find duplicate elements in a given integers list in java using Stream functions?

package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34, 34, 56, 77, 89, 34, 33, 24,56,34);
        List<Integer> distinct = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        for (int i:list){
            if(distinct.contains(i)){
                duplicate.add(i);
            }
            else
                distinct.add(i);
        }
        System.out.println("Here is the Duplicate Values " +duplicate);

//        list.stream().filter(n -> ! list2.add(n)).distinct().collect(Collectors.toList());
//        List <Integer> list1 = list.stream().distinct().collect(Collectors.toList());
//        System.out.println("here is the Original  Values "  +list);
//        System.out.println("Here is the list without duplicate Values "+ list1);

    }
}
