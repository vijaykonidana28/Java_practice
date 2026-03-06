import java.util.*;
class Cloning
{
    public static void main(String[] args)
    {
        ArrayList<String> ll = new ArrayList<String>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("mango");
        ll.add("Donkey");
        ll.add("Dinosaur");
        System.out.println("The original list : "+ll);
        ArrayList<String> kl = (ArrayList<String>) ll.clone();
        System.out.println("The clonned list is : "+kl);
    }
}