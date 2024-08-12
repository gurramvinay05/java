import java.util.*;
public class listvinay {
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();
//      Here we are adding the values
        list.add(0,1);
        list.add(1,10);
        list.add(2,100);
        list.add(3,1000);
        list.add(4,10000);
        list.add(20000);
        System.out.println("getting the values" + list.get(5));
        System.out.println("Here is the list : " + list);

        List<Integer> list1 = new ArrayList<Integer>(list);
//      Here we are adding the values
        list1.add(0,1);
        list1.add(1,10);
        list1.add(2,100);
        list1.add(3,1000);
        list1.add(4,10000);
        System.out.println("Here is the list : " + list1);

        List<Integer> list11 = new LinkedList<Integer>();
//      Here we are adding the values
        list11.add(0,0);
        list11.add(1,11);
        list11.add(2,22);
        list11.add(3,33);
        list11.add(4,44);

        System.out.println("Here is the list1 : " + list11);

        int index=list.indexOf(100);
        System.out.println("Here is the index : " + index);


//      we have to place list1 in list with index of 3
//      list.addAll(3,list1);
//      we are placing list1 in the list without index then it will execute end of the list.
        list.addAll(list1);
        System.out.println("Here is the list : " + list);
//      Here we are using get method to print the index value of 2
        System.out.println(list.get(2));
//      Here we are removing value which index is 1
        System.out.println(list.remove(0));

        System.out.println("Here is the list : " + list);
//      Here is iterator of list
        Iterator i=list.iterator();
        while(i.hasNext())
            System.out.println("Here is the iterated list " +i.next());



//      Here we are clearing the list x
        list.clear();
        System.out.print("Here is the list : " + list);
    }
}