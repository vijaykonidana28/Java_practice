// Java program to shuffle the elements in the list.
import java.util.*;
class Shuffle
{
    public static void main(String[] args)
    {
        List<String> ll = new ArrayList<String>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("mango");
        ll.add("Donkey");
        ll.add("Dinosaur");
        System.out.println("Before shuffing the list : ");
        System.out.println(ll);
        // Shuffling the list using collections.
        System.out.println("After Shuffling the list : ");
        Collections.shuffle(ll);
        System.out.println(ll);


    }
}