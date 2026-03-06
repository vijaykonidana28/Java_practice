// Creating a sublist to the list.
import java.util.*;
class Sublist{
    public static void main (String[] args)
    {
        List<String> ll = new ArrayList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("Three");
        ll.add("Four");
        ll.add("five");
        System.out.println("The list is : ");
        System.out.println(ll);
        // List<String> sb = ll.subList(2,4);
        // System.out.println("The sublist of the list : ");
        // System.out.println(sb);
        // making the sublist using the for loop.
        List<String> p = new ArrayList<String>();
        for(int i=2;i<4;i++)
        {
            p.add(ll.get(i));
        }
        System.out.println("The List elements are : "+p);
    }
}