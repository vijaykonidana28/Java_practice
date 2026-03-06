import java.util.*;
class Some
{
    public static void main(String[] args)
    {
        List<Integer> ll = new ArrayList<Integer>();
        ll.add(14);
        ll.add(90);
        ll.add(45);
        ll.add(36);
        ll.add(15);
        System.out.println("The first List is : "+ll);
        List<Integer> kl = new ArrayList<Integer>();
        kl.add(13);
        kl.add(24);
        kl.add(31);
        kl.add(45);
        kl.add(36);
        System.out.println("The second List is : "+kl);
        List<Integer> ml = new ArrayList<Integer>();
        ml.addAll(ll);
        ml.addAll(kl);
        System.out.println("The third combined List is : "+ml);
        // Sorting the list
        Collections.sort(ml);
        System.out.println("After sorting the list is : "+ml);
        // Reversing the list
        Collections.reverse(ml);
        System.out.println("Reversing the list : "+ml);
    }
}