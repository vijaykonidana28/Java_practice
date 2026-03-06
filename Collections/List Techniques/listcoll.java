// Creating a List 
import java.util.*;
public class listcoll
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("BMW");
        list.add("Porsche");
        list.add("Land Rover");
        list.add("Tata");
        list.add("Dodge");
        System.out.println(list);
        // Adding the elements in the specified positions
        list.add(3,"Volvo");
        list.add(1,"Pagani");
        // Printing the elements in the list using the for loop.
        System.out.println("This is printed through the for loop : ");
        for(String e : list)
        {
            System.out.print(e+" ");
        }
    }
}