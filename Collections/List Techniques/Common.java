// getting the common elements in the lists.
import java.util.*;
class Common{
    public static void main(String[] args)
    {
        List<String> ll = new ArrayList<String>();
        ll.add("Apple");
        ll.add("ice cream");
        ll.add("Strawberry");
        ll.add("mango");
        ll.add("Pine Apple");
        System.out.println("The first list is : "+ll);
        List<String> kl = new ArrayList<String>();
        kl.add("bango");
        kl.add("Strawberrry");
        kl.add("Mango");
        kl.add("Apple");
        kl.add("tango");
        System.out.println("The second list is : "+kl);
        List<String> ml = new ArrayList<String>();
        for(String e :ll)
        {
            if(kl.contains(e))
            {
                ml.add(e);
            }
        }
        System.out.println("The third list is : "+ml);
    }
}