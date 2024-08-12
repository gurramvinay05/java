//find the total number of elements present in the list using Stream functions
package streams;
import java.util.Arrays;
import java.util.List;

public class count {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,34,56, 2, 1,56,3,65,2,45);
        long c = list.stream().count();
//        System.out.println("Here is the Count of the List  " +i);
        List<String> list1 =Arrays.asList("vinay", "Murali","Purabi","preeya");
        int count1=0;
        for( int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
            if(list1.get(i).startsWith("P") || list1.get(i).startsWith("p")){
                count1++;
            }
        }
        System.out.println("Here is the Count "+count1);

    }
}
