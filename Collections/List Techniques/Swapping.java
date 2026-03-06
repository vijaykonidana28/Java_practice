import java.util.*;
class Swapping
{
    public static void main(String[] args)
    {
        List<Integer> ll = new ArrayList<Integer>();
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.add(16);
        System.out.println("The list before Swapping : "+ll);
        Collections.swap(ll,0,3);
        System.out.println("The list after Swapping : "+ll);


    }
}